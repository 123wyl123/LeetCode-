package One;

import java.util.ArrayList;
import java.util.List;

public class Eighteen {
    List<List<Integer>> a;
    public List<List<Integer>> generate(int numRows) {
        if (numRows==0)
        {
            return new ArrayList<>();
        }
        a = new ArrayList<>();
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        a.add(objects);
        for (int i = 0; i <numRows-1 ; i++) {
            ArrayList<Integer> integers = new ArrayList<>();
            integers.add(1);
            List<Integer> list = a.get(i);
            int size = list.size();
            for (int j = 0; j <size-1 ; j++) {
                integers.add(list.get(j)+list.get(j+1));
            }
            integers.add(1);
            a.add(integers);
        }
return a;
    }

}
