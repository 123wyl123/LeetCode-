package Two;

import java.util.LinkedList;
import java.util.List;

public class TwentyEight {
    public List<String> summaryRanges(int[] nums) {

        LinkedList<String> strings = new LinkedList<>();
        int length = nums.length;
        if (length==0)
        {
            return strings;
        }
        int pre =0;
        for (int i = 0; i <length-1; i++) {
            if (nums[i]==nums[i+1]-1)
            {
                continue;
            }else
            {
                if (i-pre>=1)
                {
                    strings.addLast(nums[pre]+"->"+nums[i]);
                    pre=i+1;
                }else
                {
                    strings.addLast(nums[pre]+"");
                    pre =i+1;

                }
            }
        }
        if (pre!=length-1)
        {
            strings.addLast(nums[pre]+"->"+(nums[length-1]));
        }else
        {
            strings.addLast(nums[pre]+"");
        }
        return strings;
    }
}
