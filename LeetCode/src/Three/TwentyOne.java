package Three;

public class TwentyOne {
    public int[] maxNumber(int[] nums1, int[] nums2 , int k )
    {
        int m = nums1.length;
        int n = nums2.length;
        int [] maxSubsequence = new int[k];
        int start = Math.max(0,k-n);
        int end = Math.min(k,m);
        for (int i = start; i <=end ; i++) {
            int subsequence1[] = maxSubsequence1(nums1,i);
            int subsequence2[] = maxSubsequence1(nums2,k-i);
            int[] curMaxSubsequence = merge(subsequence1, subsequence2);
            if (compare(curMaxSubsequence, 0, maxSubsequence, 0) > 0) {
                System.arraycopy(curMaxSubsequence, 0, maxSubsequence, 0, k);
            }
        }
        return maxSubsequence;
    }
    public int[] maxSubsequence1(int[] num,int k)
    {
        int length = num.length;
        int a[] = new int[k];
        int remain = length-k;
        int top =-1;
        for (int i = 0; i <length ; i++) {
            int i1 = num[i];
            while (remain>0&&top>=0&&num[i]>a[top])
            {
                remain--;
                top--;
            }
            if (top<k-1)
            {
                a[++top] = i1;
            }else
            {
                remain--;
            }
        }
        return a;
    }
    public int[] merge(int a[],int b[])
    {
        int length = a.length;
        if (length==0)
        {
            return b;
        }
        int length1 = b.length;
        if (length1==0)
        {
            return a;
        }
        int Zlength = length+length1;
        int temp[] = new int[Zlength];
        int indexa=0;
        int indexb =0;
        for (int i = 0; i <Zlength ; i++) {
            if (compare(a,indexa,b,indexb)>0)
            {
                temp[i] = a[indexa++];
            }else
            {
                temp[i] = b[indexb++];
            }
        }
        return temp;
    }
    public int compare(int a[],int index1,int b[] ,int index2)
    {
        int length1 = a.length;
        int length2 = b.length;

        while (index1<length1&&index2<length2)
        {
            int deference =a[index1]-b[index2];
            if (deference!=0)
            {
                return deference;
            }
            index1++;
            index2++;
        }
        return length1-index1-(length2-index2);
    }

    }








