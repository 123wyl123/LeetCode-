package Four;

public class NinetyThree {
    int sum;
    public int reversePairs(int[] nums) {
         sum =0;

        search(0,nums.length-1,nums);
        return sum;
    }
    public int[] search(int a, int b, int[] nums)
    {      if (a==b)
    {
        return new int[] {nums[a]};
    }
    if (a>b)
    {
        return null;
    }


        int mid = (a+b)/2;
      int left[]  =  search(a,mid,nums);
      int right[] =  search(mid+1,b,nums);
        int temp[] = new int[b-a+1];
        int i =0;
        int j=0;
        int k=0;
        int pre =0;
        int sumtemp=0;
        while (i<mid-a+1&&j<b-mid)
        {
            if (left[i]<=right[j])
            {
                temp[k++] = left[i];
                i++;

            }else
            {
                temp[k++] = right[j];

                j++;
            }
        }
        while (i!=mid-a+1)
        {
            temp[k++] = left[i++];

        }
        while (j!=b-mid)
        {
            temp[k++] = right[j++];
        }
        int pre1 =0;
        for (int l = 0; l <mid-a+1 ; l++) {

            for (int m = pre1; m <b-mid ; m++) {
                if ((long)left[l]>2*(long)right[m])
                {   pre1=m+1;
                    continue;
                }else
                {
                    pre1 = m;
                    break;
                }

            }

            sum+=pre1;
        }
        return temp;
    }

    public static void main(String[] args) {
        int a[] ={1,3,2,3,1};
        new NinetyThree().reversePairs(a);
    }
}
