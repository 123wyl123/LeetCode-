package nowcoder.Eight_one;

public class one {
    public double circumference (int k) {
        // write code here        for (int i = 0; i <k ; i++) {
            double T = 3.1415926;
            double T1[] = new double[6];
            T1[0]=T/3.0;
            T1[1]=2*T/3.0;
            T1[2] = 2*T/3.0;
            T1[3] = 2*T/3.0;
            T1[4] = T/3.0;
            T1[5] = 0;
            double sum = 0;
            int j = 0;
        for (int i = 0; i <k ; i++) {
            sum+=T1[j];
            j++;
            if(i==5)
            {
                j=0;
            }
        }
        System.out.println(sum);
        return 11;
        }

    public static void main(String[] args) {
        new one().circumference(3);
    }
    }
