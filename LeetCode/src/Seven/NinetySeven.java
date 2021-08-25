package Seven;

import java.util.LinkedList;
import java.util.List;

public class NinetySeven {
    List<List<Integer>> wwk;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

         wwk= new LinkedList<>();
            for (int i1 : graph[0]) {
                LinkedList<Integer> objects = new LinkedList<>();
                objects.add(0);
                objects.add(i1);
                dfs(graph,i1,objects);
            }
            return wwk;
    }
    public  void  dfs(int[][] graph, int cur,LinkedList<Integer> ww)
    {
        if (cur==graph.length-1)
    {
        wwk.add(new LinkedList<>(ww));
        return;
    }

        for (int i : graph[cur]) {
            ww.add(i);
            dfs(graph,i,ww);
            ww.removeLast();
        }
    }
}
