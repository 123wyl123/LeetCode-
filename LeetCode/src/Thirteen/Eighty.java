package Thirteen;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Eighty {
    public List<Integer> luckyNumbers (int[][] matrix) {
        HashMap<Integer, Integer> hang = new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> lie = new HashMap<>();
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (hang.containsKey(i))
                {
                    Integer integer = hang.get(i);
                    if (integer>matrix[i][j])
                    {
                        hang.put(i,matrix[i][j]);
                    }
                }else
                {
                    hang.put(i,matrix[i][j]);
                }
                if (lie.containsKey(j))
                {
                    Integer integer = lie.get(j);
                    if (integer<matrix[i][j])
                    {
                        lie.put(j,matrix[i][j]);
                    }
                }else
                {
                    lie.put(j,matrix[i][j]);
                }

            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (matrix[i][j]==hang.get(i)&&matrix[i][j]==lie.get(j))
                {
                    res.add(matrix[i][j]);
                }
            }
        }
        return res;

    }

}
