package Six;

public class Five {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int k=0;
        if (flowerbed.length==0)
        {
            return n<=0;
        }
        boolean flag =true;
        if (flowerbed[0]==0)
        {
            flag=true;
        }else
        {
            flag=false;
        }

        for (int i = 0; i <flowerbed.length-1 ; i++) {
            if (flowerbed[i]==1)
            {   flag=false;
                continue;
            }else
            {
                if (flag&&flowerbed[i+1]==0)
                {
                    k++;
                    flag=false;
                }else   if (!flag&&flowerbed[i+1]==0)
                {
                    flag=true;
                }else
                {
                    flag=false;
                }
            }
        }
        if (flag)
        {
            k++;
        }
        return k>=n;
    }

    public static void main(String[] args) {
       int a[]= {1,0,0,0,1};

        boolean b = new Five().canPlaceFlowers(a, 1);
        System.out.println(b);
    }
}
