package Ten;

public class LeFourteen {
    public int maxScoreSightseeingPair(int[] A) {
        int temp = A[0];
        int j=0;
        int max = A[0];

        for (int i = 1; i <A.length ; i++) {
            if(A[i]+temp-i+j>max)
            {
                max = A[i]+temp-i+j;
            }
            if(A[i]>temp-i+j)
            {
                temp=A[i];
                j=i;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int a [] = {8,1,5,2,6};
        new  LeFourteen().maxScoreSightseeingPair(a);
    }
}
