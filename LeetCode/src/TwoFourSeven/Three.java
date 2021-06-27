package TwoFourSeven;

import java.util.HashMap;
import java.util.LinkedList;

public class Three {
    public long wonderfulSubstrings(String word) {
        char[] chars = word.toCharArray();

        int a[][]=new int[100005][10];
        long temp =0;
        a[0][chars[0]-'a']++;
        for (int i = 1; i<chars.length ; i++) {
            for (int j = 0; j <10 ; j++) {
                a[i][j]=a[i-1][j];
            }
            a[i][chars[i]-'a']++;
        }
        int aa[]=new int[100005];

        HashMap<Long, Long> integerIntegerHashMap = new HashMap<>();
        integerIntegerHashMap.put((long) 0,(long) 1);
        for (int i = 0; i <chars.length ; i++) {
            long ttemp=0;
            int  flag []=new int[10];
            for (int j = 0; j <10 ; j++) {
                if (a[i][j]%2==1)
                {
                    flag[j]=1;
                }
                ttemp=((a[i][j]%2)<<j)+ttemp;
            }


            if (integerIntegerHashMap.containsKey((long)ttemp))
            {
                long integer = integerIntegerHashMap.get((long)ttemp);
                temp+=integer;
                integerIntegerHashMap.put((long)ttemp,integerIntegerHashMap.getOrDefault(ttemp,(long)0)+1);
            }else
            {
                integerIntegerHashMap.put((long)ttemp,(long)1);
            }

            for (int j = 0; j <10 ; j++) {
                if (flag[j]==1)
                {
                    if (integerIntegerHashMap.containsKey((long)(ttemp-(1<<j))))
                    {
                        long integer = integerIntegerHashMap.get((long)(ttemp-(1<<j)));
                        temp+=integer;

                    }

                }else
                {
                    if (integerIntegerHashMap.containsKey((long)( ttemp+(1<<j))))
                    {
                        long integer = integerIntegerHashMap.get((long)(ttemp+(1<<j)));
                        temp+=integer;

                    }
                }
            }
        }
        return temp;

    }



    public static void main(String[] args) {
        new Three().wonderfulSubstrings("aabb");
    }
}
