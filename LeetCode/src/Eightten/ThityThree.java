package Eightten;

import Sword.ThirtyEight;

import java.util.Arrays;

public class ThityThree {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int temp=0;
        int k=0;
        for (int i = 0; i <costs.length; i++) {
            if (temp+costs[i]>coins)
            {
                return k;
            }else
            {   k++;
                temp=temp+costs[i];
            }
        }
        return k;
    }
}