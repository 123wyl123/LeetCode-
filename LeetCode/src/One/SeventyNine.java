package One;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SeventyNine {
    public String largestNumber(int[] nums) {
        PriorityQueue<String> strings = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int length1 = o1.length();
                int length = o2.length();
                int l = Math.min(length1,length);
                for (int i = 0; i < l; i++) {
                    if (o1.charAt(i) > o2.charAt(i)) {
                        return -1;
                    } else if (o1.charAt(i) < o2.charAt(i)) {
                        return 1;
                    } else {
                        continue;
                    }
                }
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer append = stringBuffer.append(o1);
                StringBuffer append1 = append.append(o2);
                StringBuffer stringBuffer1 = new StringBuffer();
                StringBuffer append2 = stringBuffer1.append(o2);
                StringBuffer append3 = append2.append(o1);
                for (int i = l; i <length+length1 ; i++) {
                    if (append1.charAt(i) > append3.charAt(i)) {
                        return -1;
                    } else if (append1.charAt(i) < append3.charAt(i)) {
                        return 1;
                    } else {
                        continue;
                    }
                }
                return 1;
            }
        });
        for (int i = 0; i <nums.length ; i++) {
           strings.add(String.valueOf(nums[i]));
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!strings.isEmpty())
        {
            stringBuffer.append(strings.poll());
        }
       if (stringBuffer.charAt(0)=='0')
       {
           return "0";
       }
       return stringBuffer.toString();
    }

    public static void main(String[] args) {
        SeventyNine seventyNine = new SeventyNine();
        int a[] = {432,43243};
        seventyNine.largestNumber(a);
    }
}
