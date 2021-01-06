package Three;

import java.util.HashMap;
import java.util.List;

public class NinetyNine {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        int size = equations.size();
        HashMap<String, Node> stringNodeHashMap = new HashMap<>();
        for (int i = 0; i <size ; i++) {
            List<String> equation = equations.remove(0);
            String remove = equation.remove(0);
            String remove1 = equation.remove(0);
            if (!stringNodeHashMap.containsKey(remove))
            {
                Node node = new Node();
                node.a=remove;
                node.farther = node;
                stringNodeHashMap.put(remove, node);

            }
            if (!stringNodeHashMap.containsKey(remove1)) {
                Node node = new Node();
                node.a=remove1;
                node.farther = node;
                stringNodeHashMap.put(remove1, node);
            }
            if (find(stringNodeHashMap.get(remove))!=find(stringNodeHashMap.get(remove1)))
            {
                find(stringNodeHashMap.get(remove1)).farther=find(stringNodeHashMap.get(remove));
            }
            stringNodeHashMap.get(remove).Child.put(stringNodeHashMap.get(remove1),values[i]);
        }
        for (String s : stringNodeHashMap.keySet()) {


            Node node = stringNodeHashMap.get(s);
            HashMap<Node, Double> child1 = node.Child;

            if (child1==null)
            {
                continue;
            }
            for (Node node1 : child1.keySet()) {
                if (node1.c==0)
                {   if (node.c ==0)
                {
                    node.c = dfs(node1)*child1.get(node1);
                }

                }else
                {
                    node.c = child1.get(node1)*node1.c;
                }


            }
            if (node.c==0)
            {
                node.c =1;
            }
            for (Node node1 : child1.keySet()) {
                node1.c = node.c/child1.get(node1);
                dfs(node1);

            }
        }


        double[] doubles = new double[queries.size()];
        int k=0;
        for (List<String> query : queries) {
            String c = query.remove(0);
            String  c1 = query.remove(0);
            if (!stringNodeHashMap.containsKey(c)||(!stringNodeHashMap.containsKey(c1))||find(stringNodeHashMap.get(c))!=find(stringNodeHashMap.get(c1)))
            {
                doubles[k] = -1.0;
                k++;
            }else
            {
                doubles[k]=stringNodeHashMap.get(c).c/stringNodeHashMap.get(c1).c;
                k++;
            }
        }
        for (double aDouble : doubles) {
            System.out.println(aDouble);
        }
        return doubles;


    }

    class Node
    {
        String  a ;
        Node farther;
        double c;
        HashMap<Node,Double> Child = new HashMap<>();

    }
    public Node find(Node a)
    {   if (a==null)
    {
        return null;
    }
        if (a!=a.farther)
        {
            a.farther = find(a.farther);
        }
        return a.farther;
    }
    public double dfs(Node a)
    {   if (a==null)
    {
        return 0;
    }
        for (Node node : a.Child.keySet()) {
            if (a.c!=0)
            {
                node.c = a.c/a.Child.get(node);
            }else
            {
                a.c = dfs(node)*a.Child.get(node);
            }

        }
        return a.c;
    }

}
