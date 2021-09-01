package Eleven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Nine {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int b[]=new int[n+1];
        int a[]=new int[n+2];
        a[0]=0;
        for (int i = 1; i <=n ; i++) {
            b[i]=a[i]-a[i-1];
        }
        for (int i = 0; i <bookings.length ; i++) {
            b[bookings[i][0]]+=bookings[i][2];
            b[bookings[i][1]+1]-=bookings[i][2];
        }
        for (int i = 1; i <=n ; i++) {
            a[i]=b[i]+a[i-1];
        }
        int c[]=new int[n];
        for (int i = 0; i <n ; i++) {
            c[i]=a[i+1];
        }
        System.out.println();

        return c;

    }



}
