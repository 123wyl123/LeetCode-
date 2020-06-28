package One;

import java.util.List;

public class TwenTy {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=  triangle.size();
        int[] a= new int[m];
        int min=999999;
        a[0] = triangle.get(0).get(0);
        for (int i = 1; i <m ; i++) {
            List <Integer>temp = triangle.get(i);
            for (int j=i;j>=0;j--)
            {
                if(j==0)
                {
                    a[j] = a[j]+temp.get(j);
                }
                else if(j==i)
                {
                    a[j]=a[j-1]+temp.get(j);
                }else
                {
                    a[j]=Math.min(a[j],a[j-1])+temp.get(j);
                }

            }
        }
        for (int i = 0; i <m ; i++) {
            min = Math.min(min,a[i]);
        }
        return min;
    }


}
