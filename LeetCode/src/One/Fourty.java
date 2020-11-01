package One;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Fourty {
    List<String> a;
    private Set<Character> lookup;
    public List<String> wordBreak(String s, List<String> wordDict) {
        a = new LinkedList<>();
        char[] chars1 = s.toCharArray();
        this.lookup = new HashSet<>();
        TrieNode trieNode = new TrieNode('0');
        for (String s1 : wordDict) {
            char[] chars = s1.toCharArray();
            TrieNode trieNode1 ;
            trieNode1 = trieNode;
            for (char aChar : chars) {

                lookup.add(aChar);
                if (trieNode1.a[aChar-'a']!=null)
                {
                    trieNode1 = trieNode1.a[aChar-'a'];
                }else
                {
                    trieNode1.a[aChar-'a'] = new TrieNode(aChar);
                    trieNode1 = trieNode1.a[aChar-'a'];
                }

            }
            trieNode1.b = true;
        }
        if(isValid( chars1))
        {
            dfs(chars1,0,new StringBuffer(),trieNode);
        }

        return a;
    }
    private boolean isValid(char[] s) {
        for(int i = 0; i < s.length; i++) {
            if(lookup.contains(s[i])) continue;
            return false;
        }
        return true;
    }
    public void dfs(char[] s ,int n, StringBuffer a1 ,TrieNode trieNode)
    {
        if (n==s.length)
        {


            a.add(a1.toString());
            return;
        }
        TrieNode trieNode1 = trieNode;
        if (a1.length()>0)
        {
            a1.append(" ");
        }


        while(n<s.length&&trieNode1!=null)
        {


            trieNode1 = trieNode1.a[s[n]-'a'];
            a1.append(s[n]);
            if (trieNode1!=null&& trieNode1.b)
            {
                dfs(s,n+1,new StringBuffer(a1),trieNode);
            }
            n++;
        }

    }
}
class TrieNode{
    char c ;
    boolean b ;
    TrieNode a[] = new TrieNode[26];
    public TrieNode(char c)
    {
        this.c = c;
    }
}







