package Zero;

import java.util.HashMap;
import java.util.HashSet;

public class ThirtySix {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Integer>> hang = new HashMap<Integer, HashSet<Integer>>();
        HashMap<Integer,HashSet<Integer>> lie = new HashMap<>();
        HashMap<Integer,HashSet<Integer>> kuai =new HashMap<>();
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                if (board[i][j]=='.')
                {
                    continue;
                }
                if (hang.containsKey(i))
                {
                    HashSet<Integer> integers = hang.get(i);
                    if (integers.contains((int)(board[i][j])-'0'))
                    {
                        return false;
                    }
                    integers.add((int)(board[i][j])-'0');
                    hang.put(i,integers);
                }else
                {
                    HashSet<Integer> integers = new HashSet<>();

                    integers.add((int)(board[i][j])-'0');
                    hang.put(i,integers);
                }
                if (lie.containsKey(j))
                {
                    HashSet<Integer> integers = lie.get(j);
                    if (integers.contains((int)(board[i][j])-'0'))
                    {
                        return false;
                    }
                    integers.add((int)(board[i][j])-'0');
                    lie.put(j,integers);
                }else
                {
                    HashSet<Integer> integers = new HashSet<>();

                    integers.add((int)(board[i][j])-'0');
                    lie.put(j,integers);
                }

               int temp= (i/3)*10+j/3;
                if (kuai.containsKey(temp))
                {
                    HashSet<Integer> integers = kuai.get(temp);
                    if (integers.contains((int)(board[i][j])-'0'))
                    {
                        return false;
                    }
                    integers.add((int)(board[i][j])-'0');
                    kuai.put(temp,integers);
                }else
                {
                    HashSet<Integer> integers = new HashSet<>();

                    integers.add((int)(board[i][j])-'0');
                    kuai.put(temp,integers);
                }

            }
        }
        return true;
    }
}
