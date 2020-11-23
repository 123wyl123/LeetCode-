package Nine;

import java.util.LinkedList;
import java.util.List;

public class SixtyNine {
    public List<Integer> pancakeSort(int[] arr) {
        LinkedList<Integer> integers = new LinkedList<>();
        int length = arr.length;
        for (int i =length ; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if (arr[j]==i)
                {   if (j!=i-1) {


                    for (int k = 0; k <=j/2; k++) {
                        int temp = arr[k];
                        arr[k] = arr[j-k];
                        arr[j-k] = temp;
                    }
                    integers.addLast(j+1);
                    for (int k = 0; k <i/2 ; k++) {
                        int temp = arr[k];
                        arr[k] = arr[i-k-1];
                        arr[i-k-1] = temp;
                    }
                    integers.addLast(i);
                    break;
                }else
                {
                   break;
                }
                }
            }
        }
        return integers;
    }

    public static void main(String[] args) {
        int a[] ={3,2,4,1};
        new SixtyNine().pancakeSort(a);
    }
}
