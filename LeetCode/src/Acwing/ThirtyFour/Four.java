package Acwing.ThirtyFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class Four {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int n=Integer.valueOf(s[0]);
        int m = Integer.valueOf(s[1]);
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        LinkedList<Integer> integers = new LinkedList<>();
        while (n>0)
        {
            n--;
            String s1 = bufferedReader.readLine();

            Integer integer = Integer.valueOf(s1);
            integers.addLast(integer);
            integerIntegerHashMap.put(integer,integerIntegerHashMap.getOrDefault(integer,0)+1);
        }
        for (Integer integer : integers) {
            if (integerIntegerHashMap.get(integer)>1)
            {
                System.out.println(integerIntegerHashMap.get(integer)-1);
            }else
            {
                System.out.println("BeiJu");
            }
        }
    }
}
