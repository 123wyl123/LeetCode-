package nowcoder.Eight;

public class one {
    public double circumference (int k) {
        // write code here        for (int i = 0; i <k ; i++) {
        double T = Math.PI;
        double T1[] = new double[6];
        T1[0]=T/3.0;
        T1[1]=Math.sqrt(3)*T/3.0;
        T1[2] = 2*T/3.0;
        T1[3] = Math.sqrt(3)*T/3.0;
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
        double v = (Math.round(sum * 1000000) / 1000000.0);
        System.out.println(v);
        return v;


    }

    public static void main(String[] args) {
        new one().circumference(3);
    }
    }
