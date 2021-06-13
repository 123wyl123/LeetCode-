package TwoFourFive;

public class Three {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        int b[]={-1,-1,-1};
        int j=0;
        for (int k1 = 0; k1 <3 ; k1++) {


            for (int i = 0; i < triplets.length; i++) {
                if (target[k1]==triplets[i][k1]) {
                    boolean flag = true;
                    for (int k = 0; k < 3; k++) {
                        if (triplets[i][k] <= target[k]) {
                            continue;
                        } else {
                            flag = false;
                            break;
                        }
                    }

                if (flag)
                {
                    for (int k = 0; k <3 ; k++) {
                        b[k]=Math.max(b[k],triplets[i][k]);
                    }
                }
                }
            }

        }
        for (int i = 0; i <3 ; i++) {
            if (b[i]!=target[i])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int a[][]={{15,2,14},{11,5,14},{11,9,10},{4,3,6},{13,3,9},{13,15,9},{15,1,10},{6,8,1},{2,15,6},{15,14,13}};
//        int b[]={15,3,14};
            int a[][]={{3,1,7},{1,5,10}};
            int b[]={3,5,7};
        new Three().mergeTriplets(a,b);
    }
}
