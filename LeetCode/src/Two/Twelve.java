package Two;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Twelve {
    List<String > aaa;
    HashSet<String >aab;
    public List<String> findWords(char[][] board, String[] words) {
        aab = new HashSet<>();
        Node1 a[] = new Node1[26];

        aaa = new LinkedList<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            if (a[chars[0] - 'a'] == null) {
                a[chars[0] - 'a'] = new Node1(chars[0] - 'a');
            }
            Node1 temp = a[chars[0] - 'a'];
            for (int i = 1; i < chars.length; i++) {
                char aChar = chars[i];
                if (temp.aa[aChar - 'a'] != null) {

                } else {
                    temp.aa[aChar - 'a'] = new Node1(aChar - 'a');
                }
                temp = temp.aa[aChar - 'a'];
            }
            temp.aaa=true;
        }

            int length = board.length;
            int width = board[0].length;
            for (int i = 0; i <length ; i++) {
                for (int j = 0; j <width ; j++) {
                    if (a[board[i][j]-'a']==null)
                    {
                        continue;
                    }else
                    {
                        dfs(board,a[board[i][j]-'a'],new boolean[board.length][board[0].length],i,j,new StringBuffer(board[i][j]+""));
                    }
                }
            }
        return aaa;
        }
    public void   dfs(char[][] board ,Node1 cur,boolean [][] bo,int i,int j,StringBuffer aaaa)
    {
        bo[i][j] = true;
        Node1[] aa = cur.aa;
        if (i+1<bo.length)
        {

            if (aa[board[i+1][j]-'a']!=null&&!bo[i+1][j])
            {
                dfs(board,aa[board[i+1][j]-'a'],bo,i+1,j,aaaa.append(board[i+1][j]));
                aaaa.deleteCharAt(aaaa.length()-1);
            }

        }
        if (i-1>=0)
        {
            if (aa[board[i-1][j]-'a']!=null&&!bo[i-1][j])
            {
                dfs(board,aa[board[i-1][j]-'a'],bo,i-1,j,aaaa.append(board[i-1][j]));
                aaaa.deleteCharAt(aaaa.length()-1);
            }

        }
        if (j+1<bo[0].length)
        {
            if (aa[board[i][j+1]-'a']!=null&&!bo[i][j+1])
            {
                dfs(board,aa[board[i][j+1]-'a'],bo,i,j+1,aaaa.append(board[i][j+1]+""));
                aaaa.deleteCharAt(aaaa.length()-1);
            }
        }
        if (j-1>=0)
        {
            if (aa[board[i][j-1]-'a']!=null&&!bo[i][j-1])
            {
                dfs(board,aa[board[i][j-1]-'a'],bo,i,j-1,aaaa.append(board[i][j-1]));
                aaaa.deleteCharAt(aaaa.length()-1);
            }
        }
        bo[i][j] = false;
        if (!cur.aaa)
        {
            return;
        }
        if (!aab.contains(new String(aaaa)))
        {
            aaa.add(new String(aaaa));
            aab.add(new String(aaaa));

        }

    }



}





class Node1
{
    int a;
   Node1 aa[] = new Node1[26];
    Node1(int a)
    {
        this.a = a;
    }
    boolean aaa;
}

