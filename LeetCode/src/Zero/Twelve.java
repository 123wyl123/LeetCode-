package Zero;

public class Twelve {
    public String intToRoman(int num) {
        int i =num;
        String a[]= new String[10];
        a[0]="I";
        a[1]="II";
        a[2]="III";
        a[3]="IV";
        a[4]="V";
        a[5]="VI";
        a[6]="VII";
        a[7]="VIII";
        a[8]="IX";
        a[9]="X";
        int ii=3;
        StringBuffer stringBuffer = new StringBuffer();
        while (num!=0)
        {
            double pow = Math.pow(10, ii);
            i=num%(int) pow;
            num=num/(int)pow;
            if (num==0)
            {   num=i;
                ii--;
                continue;
            }else
            {   if (ii==3)
            {
                for (int j = 0; j <num ; j++) {
                    stringBuffer.append("M");
                }
                num=i;
            }else if (ii==2)
            {
                if (num==9)
                {
                    stringBuffer.append("CM");
                    num=i;
                }else if (num<4)
                {
                    for (int j = 0; j <num ; j++) {
                        stringBuffer.append("C");
                    }
                    num=i;
                }else if (num==4)
                {
                    stringBuffer.append("CD");
                    num=i;
                }else if (num==5)
                {
                stringBuffer.append("D");
                num=i;
                }else
                {
                    stringBuffer.append("D");
                    for (int j = 0; j <num%5 ; j++) {
                        stringBuffer.append("C");
                    }
                    num=i;
                }
            }else if (ii==1)
            {
                if (num==9)
                {
                    stringBuffer.append("XC");
                    num=i;
                }else if (num<4)
                {
                    for (int j = 0; j <num ; j++) {
                        stringBuffer.append("X");
                    }
                    num=i;
                }else if (num==4)
                {
                    stringBuffer.append("XL");
                    num=i;
                }else if (num==5)
                {
                    stringBuffer.append("L");
                    num=i;
                }else
                {
                    stringBuffer.append("L");
                    for (int j = 0; j <num%5 ; j++) {
                        stringBuffer.append("X");
                    }
                    num=i;
                }
            }else
            {
            stringBuffer.append(a[num-1]);
            num=i;
            }
            ii--;
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        new Twelve().intToRoman(3);
    }
}
