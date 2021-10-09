package One;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class EightySeven {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String,Integer> temp =  new HashMap<>();
        for(int i=0;i<=s.length()-10;i++)
        {  String temp1= s.substring(i,i+10);
            temp.put(temp1,temp.getOrDefault(temp1,0)+1);
        }
        HashSet<String> a = new HashSet<>();
        List<String> b=  new LinkedList<>();
        for(String cur:temp.keySet())
        {   if(temp.get(cur)>=2)
        {
            if(a.contains(cur))
            {
                continue;
            }else
            {
                a.add(cur);
                b.add(cur);
            }
        }
        }
        return b;
    }
}

