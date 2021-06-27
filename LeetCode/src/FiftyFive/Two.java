package FiftyFive;

import java.util.HashMap;
import java.util.HashSet;

public class Two {
    public String removeOccurrences(String s, String part) {
        char[] chars = s.toCharArray();
        char[] chars1 = part.toCharArray();
        int a[] = new int[1000];
        int k = 0;
        for (int i = 0; i < 1000; i++) {
            a[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars1[0]) {
                a[k++] = i;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            boolean flag = true;
        if (i==2)
        {
            System.out.println();
        }
            for (int j = 0; j < k; j++) {
                if (a[j] != Integer.MAX_VALUE) {
                    flag=dfs(chars,chars1,a[j],0);
                    if (flag)
                    {   int temp =0;
                        for (int l = a[j]; l <chars.length ; l++) {
                            if (chars[l]==' ')
                            {
                                continue;
                            }else
                            {
                                chars[l]=' ';
                                temp++;
                            }
                            if (temp==chars1.length)
                            {
                                break;
                            }
                        }
                        a[j]=Integer.MAX_VALUE;
                        break;
                    }

                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]!=' ')
            {
                stringBuffer.append(chars[i]);
            }
        }
        return stringBuffer.toString();
    }
    public boolean dfs(char[] a, char[] b,int i,int j)
    {
        for (int k = 0; k <b.length ; k++) {
            if (i==a.length)
            {
                return false;
            }
            if (a[i]==b[k])
            {   i++;
                continue;
            }else if (a[i]==' ')
            {
                i++;
                k--;
            }else
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Two().removeOccurrences("daabcbaabcbc"
                ,"abc");
    }
}
