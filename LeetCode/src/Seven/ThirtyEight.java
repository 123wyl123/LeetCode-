package Seven;

import java.util.Deque;
import java.util.LinkedList;

public class ThirtyEight {
    public int monotoneIncreasingDigits(int N) {
        Deque<Integer> a = new LinkedList<>();
      while (N!=0)
      {
          a.push(N%10);
          N=N/10;
      }
      int aa[] = new int[a.size()];
        int size = a.size();
        for (int i = 0; i <size ; i++) {
            aa[i] =a.pop();
        }
      if (size==1)
      {
          return    N;
      }
      boolean flag = false;
        for (int i = 0; i <size-1 ; i++) {
            if (aa[i]<=aa[i+1])
            {
                continue;
            }else
            { int temp;

                 aa[i]=aa[i]-1;
                  temp =aa[i];

                int j=0;
                for (j = 0; j <=i ; j++) {
                    if (aa[j]<=temp)
                    {
                        continue;
                    }else
                    {
                        aa[j]=aa[j]-1;
                        flag = true;
                        break;
                    }
                }
            j =Math.min(j,i);
                    for (int k =j +1; k <size ; k++) {
                        aa[k]=9;
                    }


            }

        }
        int lk=0;
        for (int i = 0; i <size ; i++) {
            lk=lk*10+aa[i];
        }

return lk;
    }

    public static void main(String[] args) {
        int i = new ThirtyEight().monotoneIncreasingDigits(9998);
        System.out.println(i);
    }
}
