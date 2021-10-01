package Fourteen;

import java.util.HashSet;
import java.util.List;

public class ThirtySix {
    public String destCity(List<List<String>> paths) {
        HashSet<String> cc=  new HashSet<>();
        HashSet<String> cur =new HashSet<>();
        for(int i =0;i<paths.size();i++)
        { List<String> cur1=paths.get(i);
            cc.add(cur1.get(0));
            cc.add(cur1.get(1));
            cur.add(cur1.get(0));
        }
        for(String aa: cc)
        {
            if(cur.contains(aa))
            {
                continue;
            }else
            {
                return aa;
            }
        }
        return "";
    }
}