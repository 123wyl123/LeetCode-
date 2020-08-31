package Three;

import java.util.*;

public class ThirtyTwo {
    Map<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
    List<String> itinerary = new LinkedList<String>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String src = ticket.get(0), dst = ticket.get(1);
            if (!map.containsKey(src)) {
                map.put(src, new PriorityQueue<String>());
            }
            map.get(src).offer(dst);
        }
        dfs("JFK");
        Collections.reverse(itinerary);
        return itinerary;
    }

    public void dfs(String curr) {
        while (map.containsKey(curr) && map.get(curr).size() > 0) {
            String tmp = map.get(curr).poll();
            dfs(tmp);
        }
        itinerary.add(curr);
    }


    public static void main(String[] args) {
List<List<String>> linkedLists = new LinkedList<>();
        LinkedList<String> strings = new LinkedList<>();
        strings.add("MUC");
        strings.add("LHR");
        linkedLists.add(strings);
        LinkedList<String> strings1 = new LinkedList<>();
        strings1.add("JFK");
        strings1.add("MUC");
        linkedLists.add(strings1);
        LinkedList<String> strings2 = new LinkedList<>();
        strings2.add("SFO");
        strings2.add("SJC");
        linkedLists.add(strings2);
        LinkedList<String> strings3 = new LinkedList<>();
        strings3.add("LHR");
        strings3.add("SFO");
        linkedLists.add(strings3);
        new ThirtyTwo().findItinerary(linkedLists);

    }
}
