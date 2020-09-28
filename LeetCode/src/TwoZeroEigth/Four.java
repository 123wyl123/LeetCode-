package TwoZeroEigth;

public class Four {
    int sum =0;
    public int maximumRequests(int n, int[][] requests) {
        int a[] = new int[n];
        int b[] = new int[n];
        dfs(0,requests,0,a,b);
        return sum;
    }
   void  dfs(int k,int[][] requests,int temp,int in[],int out[])
   {
       if (requests.length==k)
       {
           for (int i = 0; i <in.length ; i++) {
               if (in[i]!=0)
               {
                   return;
               }
           }
           sum=Math.max(sum,temp);
           return;
       }
       for (int i = k; i <requests.length ; i++) {
           in[requests[i][0]]++;
           in[requests[i][1]]--;
           dfs(i+1,requests,temp+1,in,out);
           in[requests[i][0]]--;
           in[requests[i][1]]++;
       }
       int tem =0;
       for (int i = 0; i <in.length ; i++) {
           if (in[i]!=0)
           {
               return;
           }
       }

       sum=Math.max(sum,temp);
   }

    public static void main(String[] args) {

        int a[][] ={{3,0},{2,2},{3,0},{0,1},{1,2},{0,0},{3,2},{1,2}};
        new Four().maximumRequests(4,a);
    }
}
