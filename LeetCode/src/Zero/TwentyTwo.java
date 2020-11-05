package Zero;

import java.util.LinkedList;
import java.util.List;

public class TwentyTwo {
    List<String> strings;

    public List<String> generateParenthesis(int n) {
        strings = new LinkedList<>();
        dfs(2*n,0,0,"");

        return strings;
    }

    public void dfs(int n, int l , int r,String  s)
    {
        if (n==l+r&&l==r)
        {
            strings.add(new String(s));
            return;
        }
        for (int i = l+r; i <n ; i++) {
            if (r>l||l+r>n||l>n/2||r>n/2)
            {
                return;
            }
            dfs(n,l+1,r,s+"(");
            s+=")";
            r++;
        }
        if (n==l+r&&l==r)
        {
            strings.add(new String(s));
            return;
        }
    }

    public static void main(String[] args) {
        new TwentyTwo().generateParenthesis(3);
    }
}
