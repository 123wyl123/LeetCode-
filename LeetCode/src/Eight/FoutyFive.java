package Eight;

import java.util.Deque;
import java.util.LinkedList;

public class FoutyFive {
    public int longestMountain(int[] A) {
        if (A.length<=1)
        {
            return 0;
        }
        boolean flag = true;
        int max = 0;
        Deque<Integer> a = new LinkedList<>();
        a.add(0);
        for (int i = 1; i <A.length; i++) {
            if (flag)
            {
                if (A[i]>A[a.peek()])
                {
                 a.push(i);
                }else if (A[i]==A[a.peek()])
                {
                    while (!a.isEmpty())
                    {
                        a.pop();
                    }
                    a.push(i);
                }else
                {
                    if (a.size()>=2)
                    {
                        flag=false;
                        a.push(i);
                    }else
                    { while (!a.isEmpty())
                    {
                        a.pop();
                    }
                        a.push(i);
                    }

                }
            }else
            {
                if (A[i]<A[a.peek()])
                {
                    a.push(i);
                }else
                {
                    max = Math.max(a.size(),max);
                    while (!a.isEmpty())
                    {
                        a.pop();
                    }
                    if (A[i-1]<A[i])
                    {
                        a.push(i-1);
                        a.push(i);
                    }else
                    {
                        a.push(i);
                    }

                    flag=true;
                }

            }

        }
        if (a.size()>=3)
        {   if (flag)
        {

        }else
        {max = Math.max(a.size(),max);

        }

        }


        return max;
    }
    public int longestMountain1(int[] A) {
        int l =0;
        int r = 1;
        int max = 0;
        boolean flag = true;
        while (r<A.length&&l<r)
        {

           if (flag)
           {
               if (A[r]>A[r-1])
               {
                    r++;
               }else if (A[r]==A[r-1])
               {
                   l = r;
                   r++;
               }else
               {
                if (r-l>=2)
                {
                    flag = false;
                }else
                {
                    l = r;
                    r++;
                }
               }

           }else
           {
               if (A[r]<A[r-1])
               {
                   r++;
               }else
               {
                   max = Math.max(max,r-l);
                   l= r-1;
                   r = r;
                   flag = true;
               }

           }

        }
        if (!flag)
        {
            max = Math.max(r-l,max);
        }

        return max;
    }
    public static void main(String[] args) {
        int a[] ={0,1,0,0,1,0,0,1,1,0,0,0,1,1,0,1,0,1,0,1,0,0,0,1,0,0,1,1,0,1,1,1,1,1,0,0,1,0,1,1,0,0,0,0,0,0,0,0,1,1,0,0,1,1,1,1,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,1,0,0,0,0,1,0,0,1,1,1,1,1,1,1,0,1,1,0,1,1,1,0,0,0,1,0,1,1};
        new FoutyFive().longestMountain1(a);
    }
}
