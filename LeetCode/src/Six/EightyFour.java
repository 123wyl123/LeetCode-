package Six;

public class EightyFour {
    public int[] findRedundantConnection(int[][] edges) {
        int[] roots = new int[edges.length+1];
        for (int i = 0; i < roots.length; i++) roots[i] = i;
        for (int[] edge : edges) {
            int i = edge[0];
            int i1 = edge[1];
            int i2 = find(roots, i);
            int i3 = find(roots, i1);
            if (i3==i2)
            {
                return edge;
            }
            roots[i2] =i3;
        }
        return null;
    }
    private int find(int[] roots, int i){
        while (i != roots[i]){
            roots[i] = roots[roots[i]];
            i = roots[i];
        }
        return i;
    }
}
