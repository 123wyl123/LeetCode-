package Eight;

import java.util.Arrays;
import java.util.HashMap;

public class EightyOne {
    public int numRescueBoats(int[] people, int limit) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        Arrays.sort(people);
        int l=0;
        int r = people.length-1;
        int sum=0;
        int cur=0;
        while (l<=r)
        {
            if (cur+people[r]<=limit) {
                cur = cur + people[r];
                r--;
            }
            if (l<=r&&cur+people[l]<=limit)
            {   cur=cur+people[l];
                l++;
            }

            if (cur<=limit)
            {
                cur=0;
                sum++;
            }

        }
        if (cur!=0)
        {
            sum++;
        }
        return sum;

    }


}
