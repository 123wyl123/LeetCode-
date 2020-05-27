package Zero;

public class LeSeven {
    public int reverse(int x) {
        long temp2 = 2;
        int temp=0 ,temp1 ;

        if(x>2147483647)
        {
            return 0;
        }
        if(x<=-2147483648)
        {
            return 0;
        }
        if(x>0)
        {   while (x!=0) {
            temp1 = x%10;
            x = x / 10;
            temp =temp*10+temp1;
            if(temp>214748364||temp==214748364&&x>7)
            {
                return 0;
            }
        }
        }
        else
        {
            x=-x;
            while (x!=0)
            {
                temp1 = x%10;
                x = x / 10;
                temp =temp*10+temp1;
                if(temp>214748364||temp==214748364&&x>7)
                {
                    return 0;
                }
            }

            temp = -temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        LeSeven a = new LeSeven();
        System.out.println(a.reverse(-2147483647));

    }
}
//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
//        示例 1:
//
//        输入: 123
//        输出: 321
//
//
//        示例 2:
//
//        输入: -123
//        输出: -321
//
//
//        示例 3:
//
//        输入: 120
//        输出: 21
