package TwoEightZero;

public class Two {
    public int maxDistance(int[] nums1, int[] nums2) {
        int temp =0;

        for (int i = 0; i <nums1.length ; i++) {
            if (nums2.length-i<temp)
            {
                break;
            }
            int l=i;
            int r =nums2.length-1;
            while (l<r)
            {
                int mid = ((r-l)+1)/2+l;
                if (nums2[mid]<nums1[i])
                {
                    r=mid-1;
                }else
                {
                    l=mid;
                }
            }
            temp=Math.max(temp,l-i);
        }
        return temp;
    }

    public static void main(String[] args) {
        int a[]={30,29,19,5};
        int b[]={25,25,25,25,25};
        new Two().maxDistance(a,b);
    }
}
