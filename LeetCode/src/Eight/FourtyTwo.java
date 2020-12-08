package Eight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FourtyTwo {
        LinkedList<Integer> aas;
    public List<Integer> splitIntoFibonacci(String S) {
        aas = new LinkedList<>();
        char[] chars = S.toCharArray();
        dfs(chars,0,chars.length,new ArrayList<Integer>());
        return aas;
    }
    public void dfs(char S[] , int k , int n,ArrayList<Integer> a)
    {
        if (k==n&&a.size()>=3)
        {
           aas = new LinkedList<>(a);
           return;
        }
        int temp =0;
        for (int i = k; i <n ; i++) {
            if (temp==0&&S[i]=='0')
            {    if (a.size()>=2)
            {
                int size = a.size();

                if (a.get(size-1)+a.get(size-2)<temp)
                {
                    return;
                }else if (a.get(size-1)+a.get(size-2)>temp)
                {
                   return;
                }
            }
                a.add(0);
                dfs(S,i+1,n,a);
                a.remove(a.size()-1);
                return;
            }else
            {
                temp=temp*10+S[i]-'0';

                if (a.size()>=2)
                {
                    int size = a.size();

                    if (a.get(size-1)+a.get(size-2)<temp)
                    {
                        return;
                    }else if (a.get(size-1)+a.get(size-2)>temp)
                    {
                        continue;
                    }
                }
                a.add(temp);
                dfs(S,i+1,n,a);
                a.remove(a.size()-1);
            }

        }
    }

    public static void main(String[] args) {
        new FourtyTwo().splitIntoFibonacci("0123");
    }
}
