package Five;

public class TwentyNine {

    public char[][] updateBoard(char[][] board, int[] click) {

        if(board[click[0]][click[1]]=='M')
        {
            board[click[0]][click[1]]='X';
        }else
        {
            int n = click[0];
            int m = click[1];
            board=    dps(board,n,m);
        }

        return board;
    }
    public char[][] dps(char[][] board ,int n,int m)
    {
        if(n<0||m<0||n>=board.length||m>=board[0].length||board[n][m]!='E')
        {
            return board;
        }

        int k =0;
        if(n-1>=0&&m-1>=0&&board[n-1][m-1]=='M')
        {
            k++;
        }
        if(n-1>=0&&board[n-1][m]=='M')
        {
            k++;
        }
        if(n-1>=0&&m+1<board[0].length&&board[n-1][m+1]=='M')
        {
            k++;
        }
        if(m-1>=0&&board[n][m-1]=='M')
        {
            k++;
        }
        if(m+1<board[0].length&&board[n][m+1]=='M')
        {
            k++;
        }
        if(n+1<board.length&&m-1>=0&&board[n+1][m-1]=='M')
        {
            k++;
        }
        if(n+1<board.length&&board[n+1][m]=='M')
        {
            k++;
        }
        if(n+1<board.length&&m+1<board[0].length&&board[n+1][m+1]=='M')
        {
            k++;
        }
        if(k!=0)
        {

            board[n][m] = (char) (k+'0');


        }else
        {
            board[n][m] = 'B';
            board=  dps(board,n+1,m+1);
            board =  dps(board,n-1,m-1);
            board=  dps(board,n+1,m-1);
            board=   dps(board,n-1,m+1);

            board=  dps(board,n+1,m);
            board =  dps(board,n-1,m);
            board=  dps(board,n,m-1);
            board=   dps(board,n,m+1);
        }


        return board;
    }
    public static void main(String[] args) {
      char[][] a=   {{'E','E','E','E','E'},{'E','E','M','E','E'},{'E','E','E','E','E'},{'E','E','E','E','E'}};
        int b[ ] = {3,0};
        new TwentyNine().updateBoard(a,b);
    }
}
