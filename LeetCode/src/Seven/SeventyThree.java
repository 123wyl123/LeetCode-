package Seven;

import Eleven.Four;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class SeventyThree {
    public int slidingPuzzle(int[][] board) {
        HashSet<String> strings = new HashSet<>();
        Deque<int[][]> ints = new LinkedList<>();
        int a[][]={{1,2,3},{4,5,0}};
        ints.addLast(a);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                stringBuffer.append(a[i][j]);
            }
        }
        int tempe =0;
        StringBuffer stringBufferr = new StringBuffer();
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                stringBufferr.append(board[i][j]);
            }
        }
        if (stringBufferr.toString().equals(stringBuffer.toString()))
        {
            return 0;
        }
        String string = stringBuffer.toString();
        strings.add(stringBuffer.toString());

        while (!ints.isEmpty())
        {   tempe++;
            int size = ints.size();
            for (int i = 0; i <size ; i++) {
                int[][] ints1 = ints.removeFirst();
                int j=0;
                int k=0;
                boolean flag =true;
                for ( j = 0; j <2 ; j++) {
                    for ( k = 0; k <3 ; k++) {
                        if (ints1[j][k]==0)
                        {   flag=false;
                            break;
                        }
                    }
                    if (!flag)
                    {
                        break;
                    }
                }
                if (j-1>=0)
                {
                    int temp =ints1[j-1][k];
                    ints1[j-1][k]=ints1[j][k];
                    ints1[j][k]=temp;
                    StringBuffer stringBufferr1 = new StringBuffer();
                    for (int l = 0; l <2 ; l++) {
                        for (int m = 0; m <3 ; m++) {
                            stringBufferr1.append(ints1[l][m]);
                        }
                    }
                    if (strings.contains(stringBufferr1.toString()))
                    {

                    }else
                    {
                        int aa[][]=new int[2][3];
                        for (int l = 0; l <2 ; l++) {
                            for (int m = 0; m <3 ; m++) {

                                aa[l][m]=ints1[l][m];
                            }
                        }
                        strings.add(stringBufferr1.toString());
                        ints.addLast(aa);

                    }
                     temp =ints1[j-1][k];
                    ints1[j-1][k]=ints1[j][k];
                    ints1[j][k]=temp;
                }
                if (j+1<2)
                {
                    int temp =ints1[j+1][k];
                    ints1[j+1][k]=ints1[j][k];
                    ints1[j][k]=temp;
                    StringBuffer stringBufferr1 = new StringBuffer();
                    for (int l = 0; l <2 ; l++) {
                        for (int m = 0; m <3 ; m++) {
                            stringBufferr1.append(ints1[l][m]);
                        }
                    }
                    if (strings.contains(stringBufferr1.toString()))
                    {

                    }else
                    {   int aa[][]=new int[2][3];
                        for (int l = 0; l <2 ; l++) {
                            for (int m = 0; m <3 ; m++) {
                                aa[l][m]=ints1[l][m];
                            }
                        }
                        ints.addLast(aa);
                        strings.add(stringBufferr1.toString());
                    }
                    temp =ints1[j+1][k];
                    ints1[j+1][k]=ints1[j][k];
                    ints1[j][k]=temp;
                }
                if (k-1>=0)
                {
                    int temp =ints1[j][k-1];
                    ints1[j][k-1]=ints1[j][k];
                    ints1[j][k]=temp;
                    StringBuffer stringBufferr1 = new StringBuffer();
                    for (int l = 0; l <2 ; l++) {
                        for (int m = 0; m <3 ; m++) {
                            stringBufferr1.append(ints1[l][m]);
                        }
                    }
                    if (strings.contains(stringBufferr1.toString()))
                    {

                    }else
                    {   int aa[][]=new int[2][3];
                        for (int l = 0; l <2 ; l++) {
                            for (int m = 0; m <3 ; m++) {
                                aa[l][m]=ints1[l][m];
                            }
                        }
                        ints.addLast(aa);
                        strings.add(stringBufferr1.toString());
                    }
                    temp =ints1[j][k-1];
                    ints1[j][k-1]=ints1[j][k];
                    ints1[j][k]=temp;
                }
                if (k+1<3)
                {
                    int temp =ints1[j][k+1];
                    ints1[j][k+1]=ints1[j][k];
                    ints1[j][k]=temp;
                    StringBuffer stringBufferr1 = new StringBuffer();
                    for (int l = 0; l <2 ; l++) {
                        for (int m = 0; m <3 ; m++) {
                            stringBufferr1.append(ints1[l][m]);
                        }
                    }
                    if (strings.contains(stringBufferr1.toString()))
                    {

                    }else
                    {   int aa[][]=new int[2][3];
                        for (int l = 0; l <2 ; l++) {
                            for (int m = 0; m <3 ; m++) {
                                aa[l][m]=ints1[l][m];
                            }
                        }
                        ints.addLast(aa);
                        strings.add(stringBufferr1.toString());
                    }
                    temp =ints1[j][k+1];
                    ints1[j][k+1]=ints1[j][k];
                    ints1[j][k]=temp;
                }
                if (strings.contains(stringBufferr.toString()))
                {
                    return tempe;
                }
            }
        }
        return -1;
    }
}
