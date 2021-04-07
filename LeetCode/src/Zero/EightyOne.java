package Zero;

public class EightyOne {
    public boolean search(int[] nums, int target) {
        int sum =0;
        int length = nums.length;
        for (int i = 0; i <length-1 ; i++) {
            if (nums[i]>nums[i+1]) {
                sum = i ;
                break;
            }
        }
        int l =0;
        int r = sum;
        while (l<=r)
        {
            int mid =(l+r)/2;
            if (nums[mid]>target)
            {
                r=mid-1;
            }else if (nums[mid]<target)
            {
                l=mid+1;
            }else
            {
                return true;
            }
        }
        l=sum+1;
        r = length-1;
        while (l<=r)
        {
            int mid =(l+r)/2;
            if (nums[mid]>target)
            {
                r=mid-1;
            }else if (nums[mid]<target)
            {
                l=mid+1;
            }else
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] ={5,1,3};
        new EightyOne().search(a,5);
    }
}
