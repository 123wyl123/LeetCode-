package Eleven;

public class TwentyTwo {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int i =0;
        int j =0;
        for (int k = 0; k <arr2.length ; k++) {

            for (int l = j; l <arr1.length ; l++) {
                if (arr1[l]==arr2[k])
                {
                    int temp = arr1[j];
                    arr1[j] = arr1[l];
                    arr1[l] = temp;
                    j++;
                }

            }
        }
        for (int k =arr1.length- j; k>0 ; k--) {
            for (int l = j; l <j+k-1  ; l++) {
                if (arr1[l]>arr1[l+1])
                {
                    int temp = arr1[l];
                    arr1[l] = arr1[l+1];
                    arr1[l+1] = temp;

                }
            }
        }
        return arr1;
    }
}

