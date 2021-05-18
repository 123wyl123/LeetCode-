package Fourteen;

public class FourtyTwo {
    public int countTriplets(int[] arr) {
        int a[] = new int[arr.length];
        a[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            a[i]=a[i-1]^arr[i];
        }
        int sum =0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                for (int k = j; k <arr.length ; k++) {
                   if ((a[j-1]^a[i]^arr[i])==(a[j]^a[k]^arr[j]))
                   {
                       sum++;
                   }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[]={2,3,1,6,7};
        new FourtyTwo().countTriplets(a);
    }
}
