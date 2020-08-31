package Eight;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FourtyOne {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        visited[0] = true;
        Deque <Integer> a=new LinkedList<Integer>();
        for (Integer integer : rooms.get(0)) {
            a.push(integer);
        }
        int k = 1;
        while (!a.isEmpty())
        {
            Integer pop = a.pop();
            if(!visited[pop])
            {
                visited[pop] =true;
                k++;
                for (Integer integer : rooms.get(pop)) {
                    if(!visited[integer])
                    {
                        a.push(integer);
                    }
                }
            }
        }
       return k==rooms.size();
//        for (int i = 0; i <visited.length ; i++) {
//            if(!visited[i])
//            {
//                return false;
//            }
//        }
//        return true;
    }
    boolean[] vis;
    int num;

    public boolean canVisitAllRooms1(List<List<Integer>> rooms) {
        int n = rooms.size();
        num = 0;
        vis = new boolean[n];
        dfs(rooms, 0);
        return num == n;
    }

    public void dfs(List<List<Integer>> rooms, int x) {
        vis[x] = true;
        num++;
        for (int it : rooms.get(x)) {
            if (!vis[it]) {
                dfs(rooms, it);
            }
        }
    }

}
