package One;

import java.util.ArrayList;

public class SixtyFive {
    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integers1 = new ArrayList<>();

        int l =0;
        int pre =0;
        while (l<version1.length())
        {
            if (version1.charAt(l)=='.')
            {
                l++;
                integers.add(pre);
                pre =0;
            }else
            {
                pre=pre*10+(int)(version1.charAt(l)-'0');
                l++;
            }
        }
        integers.add(pre);
        pre=0;
        l=0;
        while (l<version2.length())
        {
            if (version2.charAt(l)=='.')
            {
                l++;
                integers1.add(pre);
                pre =0;
            }else
            {
                pre=pre*10+(int)(version2.charAt(l)-'0');
                l++;
            }
        }
        integers1.add(pre);
        for (int i = 0; i <Math.min(integers.size(),integers1.size()) ; i++) {
            if (integers.get(i)==integers1.get(i))
            {
                continue;
            }else if (integers.get(i)>integers1.get(i))
            {
                return 1;
            }else
            {
                return -1;
            }
        }
        if (integers.size()==integers1.size())
        {
            return 0;
        }else if (integers.size()>integers1.size())
        {
            for (int i = integers1.size(); i <integers.size() ; i++) {
                if (integers.get(i)==0)
                {
                    continue;
                }else
                {
                    return 1;
                }
            }
            return 0;
        }else
        {
            for (int i = integers.size(); i <integers1.size() ; i++) {
                if (integers1.get(i)==0)
                {
                    continue;
                }else
                {
                    return -1;
                }
            }
            return 0;
        }
    }
}