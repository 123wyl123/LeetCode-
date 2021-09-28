import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Two {
    static LinkedList<LinkedList<Integer>> b;
    public static void main(String[] args) throws Exception{
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        b= new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a[] = reader.readLine().split(",");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(1);
            System.out.println(a[i]);
        }

        int nums[]=new int[a.length];

        for(int i=0;i<a.length;i++)
        {
            nums[i]=Integer.parseInt(a[i]);
        }


        LinkedList<Integer> temp= new LinkedList<>();
        DFS(nums,0,a.length,0,temp);
        int size=b.size();
        for(int i=0;i<size;i++)
        {   temp=b.get(i);
            for(Integer b: temp)
            {
                System.out.print(b);
                System.out.print(" ");
            }
            System.out.println("--------");
        }
    }

    public static void DFS(int nums[], int l, int n, int sum, LinkedList<Integer> temp)
    {
        if(l==n)
        {
            if(sum==0&&temp.size()!=0)
            {
                b.add(new LinkedList(temp));
            }
            return;
        }
        for(int i=l;i<n;i++)
        {
            sum+=nums[i];
            temp.addLast(nums[i]);
            DFS(nums,i+1,n,sum,temp);
            sum-=nums[i];
            temp.removeLast();
        }
        if(sum==0&&temp.size()!=0)
        {
            b.add(new LinkedList(temp));
        }
    }

}

