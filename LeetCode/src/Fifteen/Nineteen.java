package Fifteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Nineteen {
    boolean ab[];
    int aa[];
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            if (!map.containsKey(edge[0]))map.put(edge[0],new ArrayList<>());
            if (!map.containsKey(edge[1]))map.put(edge[1],new ArrayList<>());
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        ab = new boolean[n];
         aa = new int[n];
        char[] chars = labels.toCharArray();
        dfs(0,map,chars);
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        return aa;
    }
    public HashMap<Integer, Integer> dfs(int n,HashMap<Integer, List<Integer>> edges,char[] labels)
    {
        ab[n] = true;
        HashMap<Integer, Integer> a = new HashMap<>();
        List<Integer> list = edges.get(n);
        for (int edge : list) {
            if (!ab[edge])
            {
                HashMap<Integer, Integer> dfs = dfs(edge, edges, labels);
               int i=0;
                for (Integer integer : dfs.keySet()) {
                    a.put(integer,a.getOrDefault(integer,0)+dfs.get(integer));
                }
            }
        }
        char label = labels[n];
        a.put(label-'a',a.getOrDefault(label-'a',0)+1);
        aa[n] = a.get(label-'a');
        return a;
    }

    public static void main(String[] args) {

      int a[][] =  {{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}};

        new Nineteen().countSubTrees(7,a, "abaedcd");
    }
    ArrayList[] graph; int[] alpha; int[] result;
    public int[] countSubTrees1(int n, int[][] edges, String labels) {
        graph=new ArrayList[n];
        result=new int[n];
        alpha=new int['z'-'a'+1];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<Integer>();
        }
        for(int[] edge:edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        dfs(0, labels, -1);
        return result;
    }
    public void dfs(int node, String labels, int prevNode){
        char label = labels.charAt(node);
        int count = alpha[label - 'a']++;
        for(int child:(ArrayList<Integer>)graph[node]){
            if(child == prevNode) continue;
            dfs(child,labels, node);
        }
        result[node]=alpha[label - 'a']-count;
    }
}

