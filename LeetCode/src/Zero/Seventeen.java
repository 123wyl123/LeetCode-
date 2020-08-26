package Zero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Seventeen {
    String[] a = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> b;
    public List<String> letterCombinations(String digits) {
        if( digits.length()==0)
        {
            return new ArrayList<String>();
        }
        b = new ArrayList<>();
        dps(0,0,"",digits);
        return b;
    }
    void dps(int n, int m ,String s ,String digits)
    {   if(n==digits.length())
    {
        b.add(new String(s));
        return;
    }
        for (int i = 0; i <a[digits.charAt(n)-'2'].length() ; i++) {
            String s1 = a[digits.charAt(n)-'2'];
            char c1 = s1.charAt(i);
            s = s+String.valueOf(c1);
            dps(n+1,m+1,s,digits);
            s=   s.substring(0,s.length()-1);
        }

    }
    public List<String> letterCombinations2(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }


}
