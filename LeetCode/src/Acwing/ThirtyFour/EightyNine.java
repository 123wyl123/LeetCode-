package Acwing.ThirtyFour;

import java.util.HashMap;
import java.util.Scanner;

public class EightyNine {
   static int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("January",1);
        stringIntegerHashMap.put("February",2);
        stringIntegerHashMap.put("March",3);
        stringIntegerHashMap.put("April",4);
        stringIntegerHashMap.put("May",5);
        stringIntegerHashMap.put("June",6);
        stringIntegerHashMap.put("July",7);
        stringIntegerHashMap.put("August",8);
        stringIntegerHashMap.put("September",9);
        stringIntegerHashMap.put("October",10);
        stringIntegerHashMap.put("November",11);
        stringIntegerHashMap.put("December",12);

     String bb[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] s1 = sc.nextLine().split(" ");
            int ss=Integer.parseInt(s1[0]);
            int m=stringIntegerHashMap.get(s1[1]);
            int n=Integer.parseInt(s1[2]);
            int sum =0;
            for (int i =1 ; i <n ; i++) {
                sum+=is_lear(i)?366:365;
                sum=sum%7;
            }
            if (is_lear(n))
            {
                a[2]++;
                for (int i = 1; i <m ; i++) {
                    sum+=a[i];
                }
                a[2]--;
                sum=sum+ss;
                sum=sum%7;
            }else
            {
                for (int i = 1; i <m ; i++) {
                    sum+=a[i];
                }
                sum=sum+ss;
                sum=sum%7;
            }
            System.out.println(bb[(sum+6)%7]);
        }
    }
    static boolean is_lear(int year)
    {
        return (year%4==0&&year%100!=0)||year%400==0;
    }

}
