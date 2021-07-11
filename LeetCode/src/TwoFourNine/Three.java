package TwoFourNine;

import java.util.HashMap;
import java.util.LinkedList;

public class Three {
    int mm=0;
    static int mod = (int) 1e9 + 7;
    LinkedList<String> strings = new LinkedList<>();
    public int colorTheGrid(int m, int n) {
        mm=m;
        char b[]=new char[m];
        dfs(0,-1,b);
        HashMap<Integer, LinkedList<Integer>> integerLinkedListHashMap = new HashMap<Integer, LinkedList<Integer>>();
        for (int i = 0; i <strings.size() ; i++) {
            for (int j = 0; j <strings.size() ; j++) {
                String s = strings.get(i);
                String s1 = strings.get(j);
                boolean flag =true;
                for (int k = 0; k <s.length() ; k++) {
                    if (s1.charAt(k)==s.charAt(k))
                    {   flag = false;
                        break;
                    }
                }
                if (!flag)
                {
                   continue;
                }
                if (integerLinkedListHashMap.containsKey(i))
                {
                    LinkedList linkedList = integerLinkedListHashMap.get(i);
                    linkedList.addLast(j);
                    integerLinkedListHashMap.put(i,linkedList);
                }else 
                {
                    LinkedList<Integer> integers = new LinkedList<>();
                    integers.addLast(j);
                    integerLinkedListHashMap.put(i,integers);
                }
            }
        }
        long bb[][]=new long[n][strings.size()];
        for (int i = 0; i <strings.size() ; i++) {
            bb[0][i]=1;
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j <strings.size() ; j++) {

                LinkedList<Integer> linkedList = integerLinkedListHashMap.get(j);
                for (Integer integer : linkedList) {
                    bb[i][j]=(bb[i][j]+bb[i-1][integer])%mod ;
                }
            }
        }
        long sum =0;
        for (int i = 0; i <strings.size() ; i++) {
            sum=(sum+bb[n-1][i])%mod;
        }
return (int)(sum%mod);
    }

    public void dfs(int n,int c,char b[])
    {   if (n==mm)
    {
      strings.addLast(  new String(b));
      return;
    }
        for (int j = 0; j <3 ; j++) {
            if (c==j)
            {
                continue;
            }
            b[n]=(char) ('0'+j);
            dfs(n+1,j,b);
        }
    }

    public static void main(String[] args) {
        new Three().colorTheGrid(1,2);
    }
}
