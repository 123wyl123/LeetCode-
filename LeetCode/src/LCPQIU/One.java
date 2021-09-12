package LCPQIU;

import java.util.HashMap;

public class One {
    public int minimumSwitchingTimes(int[][] source, int[][] target) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <source.length ; i++) {
            for (int j = 0; j <source[i].length ; j++) {
                integerIntegerHashMap.put(source[i][j],integerIntegerHashMap.getOrDefault(source[i][j],0)+1);
            }
        }
        for (int i = 0; i <target.length ; i++) {
            for (int j = 0; j <target[i].length ; j++) {
                integerIntegerHashMap.put(target[i][j],integerIntegerHashMap.getOrDefault(target[i][j],0)-1);
            }
        }
        int sum=0;
        for (Integer integer : integerIntegerHashMap.keySet()) {
            System.out.println(integer);
            System.out.println(integerIntegerHashMap.get(integer));
            sum=sum+Math.abs(integerIntegerHashMap.get(integer));
        }
        return sum/2;
    }

    public static void main(String[] args) {
        int a[][]={{1,3},{5,4}};
        int b[][]={{1,3},{5,4}};
    }
}
