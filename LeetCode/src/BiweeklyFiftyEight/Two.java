package BiweeklyFiftyEight;

public class Two {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
            board[rMove][cMove]=color;
            int i=0;

        for ( i = rMove-1; i >=0 ; i--) {
           if (board[i][cMove]!=color&&board[i][cMove]!='.')
           {
               continue;
           }else if(board[i][cMove]=='.')
            {
               break;
            }else
           {
               if (i!=rMove-1)
               {
                   return true;
               }
               break;
           }
        }
        for (i = rMove+1; i <board.length ; i++) {
            if (board[i][cMove]!=color&&board[i][cMove]!='.')
            {
                continue;
            }else if(board[i][cMove]=='.')
            {
                break;
            }

            else
            {
                if (i!=rMove+1)
                {        System.out.println(2);
                    return true;
                }
                break;
            }
        }
        int j=cMove;
        for ( j = cMove-1; j >=0 ; j--) {
            if (board[rMove][j]!=color&&board[rMove][j]!='.')
            {
                continue;
            }else if(board[rMove][j]=='.')
            {
                break;
            }else
            {
                if (j!=cMove-1)
                {
                    return true;
                }
                break;
            }
        }
        for ( j = cMove+1; j <board[0].length ; j++) {
            if (board[rMove][j]!=color&&board[rMove][j]!='.')
            {
                continue;
            }else if(board[rMove][j]=='.')
            {
                break;
            }else
            {
                if (j!=cMove+1)
                {
                    return true;
                }
                break;
            }
        }
        for (int k = 1; k <=Math.min(cMove,rMove) ; k++) {
            if (board[rMove-k][cMove-k]!=color&&board[rMove-k][cMove-k]!='.')
            {
                continue;
            }else if(board[rMove-k][cMove-k]=='.')
            {
                break;
            }else
            {
                if (k!=1)
                {
                    return true;
                }
                break;
            }
        }
        for (int k = 1; k <Math.min(rMove+1,board[0].length-cMove) ; k++) {
            if (board[rMove-k][cMove+k]!=color&&board[rMove-k][cMove+k]!='.')
            {
                continue;
            }else if(board[rMove-k][cMove+k]=='.')
            {
                break;
            }
            else
            {
                if (k!=1)
                {
                    return true;
                }
                break;
            }
        }
        for (int k = 1; k <Math.min(board.length-rMove,cMove+1) ; k++) {
            if (board[rMove+k][cMove-k]!=color&&board[rMove+k][cMove-k]!='.')
            {
                continue;
            }else if(board[rMove+k][cMove-k]=='.')
            {
                break;
            }else
            {
                if (k!=1)
                {
                    return true;
                }
                break;
            }
        }
        for (int k = 1; k <Math.min(board.length,board[0].length) ; k++) {
            if (board[rMove+k][cMove+k]!=color&&board[rMove+k][cMove+k]!='.')
            {
                continue;
            }else if(board[rMove+k][cMove+k]=='.')
            {
                break;
            }else
            {
                if (k!=1)
                {
                    return true;
                }
                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        char a[][]= {{'B','W','.','B','W','W','B','.'},{'B','.','.','B','W','W','.','.'},{'W','W','.','B','B','.','B','W'},{'B','W','B','.','B','.','B','B'},{'B','W','W','B','.','W','B','B'},{'W','W','.','B','W','B','.','.'},{'W','.','B','W','W','B','.','B'},{'W','.','B','B','.','B','.','.'}};




        new Two().checkMove(a,2,5,'B');
    }
}
