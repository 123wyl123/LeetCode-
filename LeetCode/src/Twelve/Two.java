package Twelve;

import java.util.*;

public class Two {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {

        char[] chars = s.toCharArray();
        int length = chars.length;
        Node aa[] =   new Node [length];
        for (List<Integer> pair : pairs) {
            Integer remove = pair.remove(0);
            Integer remove1 = pair.remove(0);
            if (aa[remove]==null)
            {
                aa[remove] = new Node(remove);
                aa[remove].father = aa[remove];
            }
            if (aa[remove1]==null)
            {
                aa[remove1] = new Node(remove1);
                aa[remove1].father = aa[remove1];
            }
            Node node = find(aa[remove]);
            Node node1 = find(aa[remove1]);
            if (node!=node1)
            {
                node.father= node1;
            }
        }
        HashMap<Node, PriorityQueue<Character>> nodePriorityQueueHashMap = new HashMap<>();
        for (int i = 0; i <length ; i++) {
            if (aa[i]==null)
            {
                continue;
            }
            Node node = find(aa[i]);
            if (nodePriorityQueueHashMap.containsKey(node))
            {
            nodePriorityQueueHashMap.get(node).add(chars[i]);
            }else
            {
                PriorityQueue<Character> characters = new PriorityQueue<>(new Comparator<Character>() {
                    @Override
                    public int compare(Character o1, Character o2) {
                        return o1 - o2;
                    }
                });
                characters.add(chars[i]);
                nodePriorityQueueHashMap.put(node,characters);
            }
        }
        for (int i = 0; i <length ; i++) {
            if (aa[i]==null)
            {
                continue;
            }
            Node node = find(aa[i]);
            PriorityQueue<Character> characters = nodePriorityQueueHashMap.get(node);
            chars[i] = characters.poll();
        }

        return new String(chars);
    }
    class Node
    {
        int a;
        Node father;
        Node(int b)
        {
            this.a = b;
        }
    }
    public Node find(Node x)
    {
        if (x.father.a!=x.a)
        {
            x.father = find(x.father);
        }
        return x.father;
    }

    public static void main(String[] args) {

        LinkedList<List<Integer>> lists = new LinkedList<>();
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addLast(0);
        integers.addLast(3); 
        lists.addLast(integers);
        LinkedList<Integer> integers1 = new LinkedList<>();
        integers1.addLast(1);
        integers1.addLast(2);
        lists.addLast(integers1);
        LinkedList<Integer> integers2 = new LinkedList<>();
        integers2.addLast(0);
        integers2.addLast(2);
        lists.addLast(integers2);
        new Two().smallestStringWithSwaps("dacb",lists);
    }
}
