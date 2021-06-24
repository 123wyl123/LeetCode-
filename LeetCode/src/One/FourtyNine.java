package One;

import java.util.HashMap;

public class FourtyNine {
    public int maxPoints(int[][] points) {
        HashMap<Integer, Integer> HashMapX = new HashMap<>();
        HashMap<Integer, Integer> HashMapY = new HashMap<>();
        for (int i = 0; i <points.length ; i++) {
            HashMapX.put(points[i][0],HashMapX.getOrDefault(points[i][0],0)+1);
            HashMapY.put(points[i][1],HashMapY.getOrDefault(points[i][1],0)+1);
        }
        int max = 0;
        for (int i = 0; i <points.length ; i++) {
            max =Math.max(HashMapX.get(points[i][0]),Math.max(max,HashMapY.get(points[i][1])));
            HashMap<String, Integer> HashMap = new HashMap<>();
            for (int j = i+1; j <points.length ; j++) {
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];
                if (x1==x2||y1==y2)
                {
                    continue;
                }
                int tempx = x2-x1;
                int tempy= y2-y1;
                int gcd = gcd(tempx, tempy);
                tempx=tempx/gcd;
                tempy=tempy/gcd;
                if (tempy<0)
                {
                    tempx=-tempx;
                    tempy=-tempy;
                }
                HashMap.put(tempx+"-"+tempy,HashMap.getOrDefault(tempx+"-"+tempy,0)+1);
            }
            for (String s : HashMap.keySet()) {
                Integer integer = HashMap.get(s);
                max =Math.max(integer+1,max);
            }
        }
        return max;
    }
    public int gcd(int a, int b)
    {
        while (b!=0){
            int temp = a%b;
            a=b;
            b= temp;
        }
        return a;
    }



    public static void main(String[] args) {
        int a[][]={{1,1},{2,2},{3,3}};
        new FourtyNine().maxPoints(a);
    }
}
