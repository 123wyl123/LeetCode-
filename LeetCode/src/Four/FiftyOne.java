package Four;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FiftyOne {
    public String frequencySort(String s) {
        PriorityQueue<Node> result = new PriorityQueue<Node>((Node a, Node b) ->
        {
            return b.b - a.b;
        });
        HashMap<Character, Node> a = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (a.containsKey(s.charAt(i))) {
                Node temp = a.get(s.charAt(i));
                temp.b++;
                a.put(s.charAt(i), temp);
            } else {
                a.put(s.charAt(i), new Node(s.charAt(i), 1));
            }

        }
        for (Character b : a.keySet()) {
            result.add(a.get(b));
        }
        StringBuffer results = new StringBuffer();
        while (!result.isEmpty()) {
            Node ss = result.poll();
            for (int i = 0; i < ss.b; i++) {
                results.append(ss.a);
            }
        }
        return results.toString();
    }

    class Node {
        char a;
        int b;

        Node(char a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}