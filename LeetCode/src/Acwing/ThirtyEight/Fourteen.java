package Acwing.ThirtyEight;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Fourteen {
    public static void main(String[] args)throws Exception
    {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n =Integer.valueOf(reader.readLine());
        HashMap<String,Integer> as =new HashMap<String ,Integer>();
    while (n>0)
    {
        n--;
        String s = reader.readLine();
        as.put(s,as.getOrDefault(s,0)+1);
    }
    int max =0;
   for(String ss : as.keySet())
   {
       Integer integer = as.get(ss);
       max =Math.max(integer,max);
   }
        System.out.println(max);
    }
}
