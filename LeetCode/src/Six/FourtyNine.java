package Six;

import java.util.HashMap;

public class FourtyNine {
    public String predictPartyVictory(String senate) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        char[] chars = senate.toCharArray();
        int temp =0;
        boolean aa[] = new boolean[chars.length];
        int bbb =0;
        while (bbb==0)
        {
            bbb=dfs(chars,aa);
        }

        if (bbb>0)
        {
            return "Dire";
        }else
        {
            return "Radiant";
        }

    }
    public int dfs(char[] chars , boolean [] a)
    {   int temp =0;
        int temp1=0;
        for (int i = 0; i <chars.length ; i++) {
            if (a[i])
            {
                continue;
            }else if (chars[i]=='D')
            {   if (temp<0)
            {
                temp++;
                a[i] = true;
                continue;
            }
                temp++;

            }else
            {
                if (temp>0)
                {
                    temp--;
                    a[i] = true;
                    continue;
                }
                temp--;

            }
        }
        for (int i = 0; i <chars.length ; i++) {
            if (a[i])
            {
                continue;
            }else
            {
                if (temp>0&&chars[i]=='R')
                {
                    a[i] = true;
                    temp--;
                }else if (temp<0&&chars[i]=='D')
                {
                    a[i] = true;
                    temp++;
                }
            }

        }
        return temp;
    }
}

