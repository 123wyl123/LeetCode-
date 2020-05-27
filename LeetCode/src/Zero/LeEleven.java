package Zero;

public class LeEleven {
    public int maxArea(int[] height) {
        int a = height.length -1;
        int r = 0;
        int max =0;
        int temp;
        while (r<=a)
        {
           temp= Math.min(height[r],height[a])*(a-r);
            if(temp>max)
            {
             max = temp;
            }
            if(height[r]<height[a])
            {
                r++;
            }
            else
            {
                a--;
            }

        }
        return  max;
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,6,7};
        LeEleven b = new LeEleven();
        b.maxArea(a);
    }
}
