package Thirteen;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ThirtyEight {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
        integerIntegerHashMap.put(arr[i],integerIntegerHashMap.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Node> nodes = new PriorityQueue<>((Node a, Node b) ->
        {
            if (a.b == b.b) {
                return -1;
            } else if (a.b < b.b) {
                return 1;
            } else {
                return -1;
            }
        });
        for (Integer integer : integerIntegerHashMap.keySet()) {
           nodes.add (new Node(integer,integerIntegerHashMap.get(integer)));
        }
        int a = 0;
        int i =0;
        while (i<(arr.length/2))
        {
            Node poll = nodes.poll();
            i+=poll.b;
            a++;
        }
        return a;
    }
    class  Node
    {
        int a;
        int b;
        Node(int a, int b)
        {
            this.a= a;
            this.b = b;
        }
    }
    public int minSetSize1(int[] arr) {
        int[] cs0 = calc(arr);
        int[] cs1 = calc(cs0);
        int sum = 0, count = 0, max = arr.length >> 1;
        for (int i = cs1.length - 1; i >= 0; i--) {
            sum += i * cs1[i];
            count += cs1[i];
            if (sum >= max) {
                return count - (sum - max) / i;
            }
        }
        return arr.length;
    }

    public int[] calc(int[] arr) {
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        int[] cs = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            cs[arr[i]]++;
        }
        return cs;
    }


}
