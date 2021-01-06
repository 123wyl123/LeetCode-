package Eight;

import java.util.LinkedList;
import java.util.List;

public class Thirty {
    public List<List<Integer>> largeGroupPositions(String s) {
        char[] chars = s.toCharArray();
        LinkedList<List<Integer>> objects = new LinkedList<>();
        int pre =0;
        int i=0;
        for ( i = 1; i <chars.length ; i++) {
            if (chars[i]==chars[i-1])
            {
                continue;
            }else
            {
                if (i-pre>=3)
                {
                    LinkedList<Integer> integers = new LinkedList<>();
                    integers.addLast(pre);
                    integers.addLast(i-1);
                    pre = i;
                    objects.addLast(integers);
                }else
                {
                    pre =i;
                }
            }
        }
        if (i-pre>=3)
        {
            LinkedList<Integer> integers = new LinkedList<>();
            integers.addLast(pre);
            integers.addLast(i-1);
            objects.addLast(integers);
        }
        return objects;
    }


}
