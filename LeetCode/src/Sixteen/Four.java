package Sixteen;

import java.util.*;

public class Four {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        PriorityQueue<String> strings2 = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (int i = 0; i < Math.min(o1.length(), o2.length()); i++) {
                    if (o1.charAt(i) == o2.charAt(i)) {
                        continue;
                    } else if (o1.charAt(i) < o2.charAt(i)) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                return -1;
            }
        });
        HashMap<String, PriorityQueue<String>> stringIntegerHashMap = new HashMap<>();
        for (int i = 0; i < keyName.length; i++) {
            if (stringIntegerHashMap.containsKey(keyName[i])) {
                stringIntegerHashMap.get(keyName[i]).add(keyTime[i]);


            } else {
                PriorityQueue<String> strings1 = new PriorityQueue<>(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        for (int i = 0; i < o1.length(); i++) {
                            if (o1.charAt(i) == o2.charAt(i)) {
                                continue;
                            } else if (o1.charAt(i) < o2.charAt(i)) {
                                return -1;
                            } else {

                                return 1;
                            }
                        }
                        return 0;
                    }
                });
                strings1.offer(keyTime[i]);
                stringIntegerHashMap.put(keyName[i], strings1);
            }
        }
        for (String s : stringIntegerHashMap.keySet()) {
            PriorityQueue<String> strings = stringIntegerHashMap.get(s);
            if (strings.size() < 3) {
                continue;
            } else {
                String poll = strings.poll();
                String poll1 = strings.poll();
                while (!strings.isEmpty()) {
                    String poll2 = strings.poll();
                    if (((poll2.charAt(0) - '0') * 10 + poll2.charAt(1) - '0') * 60 - (10 * (poll.charAt(0) - '0') + poll.charAt(1) - '0') * 60 + ((poll2.charAt(3) - '0') * 10 + poll2.charAt(4) - '0') - ((poll.charAt(3) - '0') * 10 + poll.charAt(4) - '0') <= 60) {
                        strings2.offer(s);
                        break;
                    }
                    poll = poll1;
                    poll1 = poll2;
                }

            }
        }
        LinkedList<String> strings = new LinkedList<>();
        while (!strings2.isEmpty()) {
            String poll = strings2.poll();
            strings.add(poll);
        }

        return strings;
    }

    public static void main(String[] args) {
        String a[] = {"a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "c", "c", "c", "c", "c", "c", "c", "c", "c"};
        String b[] = {"00:37", "11:24", "14:35", "21:25", "15:48", "20:28", "07:30", "09:26", "10:32", "20:10", "19:26", "08:13", "01:08", "15:49", "02:34", "06:48", "04:33", "07:18", "00:05", "06:44", "13:33", "04:12", "03:54"};
        new Four().alertNames(a, b);
    }
}

