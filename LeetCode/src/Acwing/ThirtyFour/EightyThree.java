package Acwing.ThirtyFour;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EightyThree {
    static Map integerHashMap = new HashMap<Integer,String>();
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a[]=new int[15];
        for (int i = 0; i <a.length ; i++) {
            a[i]=(int) Math.pow(2,i);
        }
        integerHashMap.put(1,"2(0)");
        integerHashMap.put(2,"2");
        integerHashMap.put(4,"2(2)");
        while (scanner.hasNext())
        {
            int b =scanner.nextInt();
            System.out.println( search(b));

        }
    }

    public static String  search(int a)
    {
        int n=30;
        StringBuffer stringBuffer = new StringBuffer();
        while (n>=0)
        {
           if (((a>>n)&1)==0)
           {

           }else
           {    if (n==1)
           {
               if (stringBuffer.length()!=0)
               {
                   stringBuffer.append("+");
               }
               stringBuffer.append("2");
           }else if (n!=2&&n!=0)
               {if (stringBuffer.length()!=0)
               {
                   stringBuffer.append("+");
               }
               if (integerHashMap.containsKey(1<<n))
               {
                   stringBuffer.append(integerHashMap.get(1<<n));
               }else {


                   stringBuffer.append("2(");
                   String search = search(n);

                   stringBuffer.append(search);
                   stringBuffer.append(")");
               }
               }else
           {
               if (stringBuffer.length()!=0)
               {
                   stringBuffer.append("+");
               }
               if (integerHashMap.containsKey(1<<n))
               {
                   stringBuffer.append(integerHashMap.get(1<<n));
               }
           }
           }
           n--;
        }
        integerHashMap.put(a,stringBuffer.toString());
        return stringBuffer.toString();
    }

}
