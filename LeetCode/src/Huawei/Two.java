package Huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Two {
    public static void main(String[] args)  throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a[] = reader.readLine().split(" ");
        int temp[] = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            temp[i]=Integer.valueOf(a[i]);
        }
        if (a.length%2==1)
        {
            if (temp[0]>=10&&temp[a.length-1]>=10)
            {       boolean flag =false;
                for(int i=1;i<a.length-1;i++)
                {
                    if (temp[i]<10)
                    {
                        continue;
                    }else
                    {
                        flag=true;
                        break;
                    }
                }
                if (!flag)
                {
                    System.out.println(true);
                    return;
                }
                flag=false;
                for (int i = 1; i <a.length-1 ; i++) {
                    if (!flag&&temp[i]<10)
                    {   flag=!flag;
                        continue;
                    }else if (flag&&temp[i]>=10)
                    {   flag=!flag;
                        continue;
                    }else
                    {
                        System.out.println(false);
                        return;
                    }
                }
                System.out.println(true);
            }else if (temp[0]<10&&temp[a.length-1]<10)
            {   boolean flag = false;
                for (int i = 1; i <a.length-1 ; i++) {
                    if (temp[i]>=10)
                    {
                        continue;
                    }else
                    {
                        flag=true;
                        break;
                    }
                }
                if (!flag)
                {
                    System.out.println(true);
                    return;
                }
                flag=false;
                for (int i = 1; i <a.length-1 ; i++) {
                    if (!flag&&temp[i]>=10)
                    {
                        flag=!flag;
                        continue;
                    }else if (flag&&temp[i]<10)
                    {
                        flag=!flag;
                        continue;
                    }else
                    {
                        System.out.println(false);
                        return;
                    }
                }
                System.out.println(true);
                return;
            }else
            {   boolean flag = temp[0]>10?false:true;
                for (int i = 1; i <a.length ; i++) {
                    if (!flag&&temp[i]<10)
                    {
                        flag=!flag;
                    }else if (flag&&temp[i]>=10)
                    {
                        flag=!flag;
                    }else
                    {
                        System.out.println(false);
                        return;
                    }
                }
                System.out.println(true);
            }
        }else
        {
            boolean flag = temp[0]>10?false:true;
            for (int i = 1; i <a.length ; i++) {
                if (!flag&&temp[i]<10)
                {
                    flag=!flag;
                }else if (flag&&temp[i]>=10)
                {
                    flag=!flag;
                }else
                {
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
        }
    }
}
