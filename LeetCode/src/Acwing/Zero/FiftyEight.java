package Acwing.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FiftyEight {
    public String printMinNumber(int[] nums)throws Exception{
    StringBuffer temp[]=new StringBuffer[nums.length];
        for (int i = 0; i <temp.length ; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(nums[i]);
            temp[i]=stringBuffer;
        }
    Arrays.sort(temp,(a,b)->
    {
       StringBuffer temp1= new StringBuffer();

     temp1.append(a);
     temp1.append(b);
     StringBuffer temp2=new StringBuffer();
     temp2.append(b);
     temp2.append(a);
        for (int i = 0; i <temp1.length() ; i++) {
            if (temp1.charAt(i)<temp2.charAt(i))
            {
                return -1;
            }else if (temp1.charAt(i)==temp2.charAt(i))
            {
                continue;
            }else
            {
                    return 1;
            }
        }
        return -1;

    });
        StringBuffer t=new StringBuffer();
        for (int i = 0; i <nums.length ; i++) {
            t.append(temp[i]);
        }
        return t.toString();
    }
}
