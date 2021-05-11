package Seventeen;

public class ThirtyFour {
    public int[] decode(int[] encoded) {
        int a[] = new int[encoded.length];
        int az =0;
        for (int i = 1; i <=a.length ; i++) {
            az=az^i;
        }
        for (int i = 1; i <encoded.length ; i+=2) {
            az=az^encoded[i];
        }
        az=az;
        a[0]=az;
        for (int i = 1; i <a.length ; i++) {
            a[i]=a[i-1]^encoded[i-1];
        }
        return a;
    }


}
