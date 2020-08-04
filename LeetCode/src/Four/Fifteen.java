package Four;

public class Fifteen {
    public String addStrings(String num1, String num2) {
        int a = num1.length();
        int b= num2.length();
        String c = "";
        int i =a-1;
        int j =b-1;
        int flag =0;
        while (i>=0&&j>=0)
        {
            int m = num1.charAt(i)-'0';
            int n = num2.charAt(j)-'0';

            i--;
            j--;
            if(m+n+flag<=9)
            {
                c = m+n+flag+c;
                flag=0;
            } else
            {
                c=(m+n+flag)%10+c;
                flag=1;
            }


        }
        if (i>=0) {
            if (flag == 0) {
                String substring = num1.substring(0, i);
                c= (flag+num1.charAt(i)-'0')+c;
                c = substring+c;
            } else {
                while (flag+num1.charAt(i)-'0'>9)
                {
                    c = (flag+num1.charAt(i)-'0')%10+c;
                    flag = 1;
                    i--;
                    if(i<0)
                    {
                        break;
                    }
                }
                if(i>=0)
                {
                    String substring = num1.substring(0, i );
                    c = substring + (num1.charAt(i) - '0' + flag) + c;
                }else
                {
                    if(flag==1)
                    {
                        return flag+c;
                    }else
                    {
                        return c;
                    }
                }


            }
            return c;
        }
        if (j>=0)
        {    if(flag==0)
        {
            String substring = num2.substring(0, j);
            c= (flag+num2.charAt(j)-'0')+c;
            c= substring+c;
        }else
        {
            while (flag+num2.charAt(j)-'0'>9)
            {
                c = (flag+num2.charAt(j)-'0')%10+c;
                flag = 1;
                j--;
                if(i<0)
                {
                    break;
                }
            }
            if(j>=0)
            {
                String substring = num2.substring(0, j );
                c=  substring  + (num2.charAt(j)-'0'+ 1 )+c;
            }else
            {
                if(flag==1)
                {
                    return flag+c;
                }else
                {
                    return c;
                }
            }

        }
            return c;
        }
        if(flag==1)
        {
            c=flag+c;
            return c;
        }
        return c;

    }

    public static void main(String[] args) {
       String a = "71";
     String  b =        "168899993";



     new Fifteen().addStrings(a,b);
    }
}
