package Two;

import java.lang.reflect.Array;
import java.util.*;

public class Eighteen {
    public List<List<Integer>> getSkyline(int[][] buildings) {
//        int N = buildings.length;
//        Op[] ops = new Op[N << 1];
//        for (int i = 0; i < buildings.length; i++) {
//            ops[i * 2] = new Op(buildings[i][0], true, buildings[i][2]);
//            ops[i * 2 + 1] = new Op(buildings[i][1], false, buildings[i][2]);
//        }
//        // 把描述高度变化的对象数组，按照规定的排序策略排序
//        Arrays.sort(ops, new OpComparator());
//
//
//        // TreeMap就是java中的红黑树结构，直接当作有序表来使用
//        // key  某个高度  value  次数
//        TreeMap<Integer, Integer> mapHeightTimes = new TreeMap<>();
//        // key   x点，   value 最大高度
//        TreeMap<Integer, Integer> mapXHeight = new TreeMap<>();
//
//
//        for (int i = 0; i < ops.length; i++) {
//            // ops[i]
//            if (ops[i].isAdd) { // 如果当前是加入操作
//                if (!mapHeightTimes.containsKey(ops[i].h)) { // 没有出现的高度直接新加记录
//                    mapHeightTimes.put(ops[i].h, 1);
//                } else { // 之前出现的高度，次数加1即可
//                    mapHeightTimes.put(ops[i].h, mapHeightTimes.get(ops[i].h) + 1);
//                }
//            } else { // 如果当前是删除操作
//                if (mapHeightTimes.get(ops[i].h) == 1) { // 如果当前的高度出现次数为1，直接删除记录
//                    mapHeightTimes.remove(ops[i].h);
//                } else { // 如果当前的高度出现次数大于1，次数减1即可
//                    mapHeightTimes.put(ops[i].h, mapHeightTimes.get(ops[i].h) - 1);
//                }
//            }
//            // 根据mapHeightTimes中的最大高度，设置mapXvalueHeight表
//            if (mapHeightTimes.isEmpty()) { // 如果mapHeightTimes为空，说明最大高度为0
//                mapXHeight.put(ops[i].x, 0);
//            } else { // 如果mapHeightTimes不为空，通过mapHeightTimes.lastKey()取得最大高度
//                mapXHeight.put(ops[i].x, mapHeightTimes.lastKey());
//            }
//        }
//        // res为结果数组，每一个List<Integer>代表一个轮廓线，有开始位置，结束位置，高度，一共三个信息
//        List<List<Integer>> res = new ArrayList<>();
//        // 一个新轮廓线的开始位置
//        int start = 0;
//        // 之前的最大高度
//        int preHeight = 0;
//        // 根据mapXvalueHeight生成res数组
//        for (Map.Entry<Integer, Integer> entry : mapXHeight.entrySet()) {
//            // 当前位置
//            int curX = entry.getKey();
//            // 当前最大高度
//            int curMaxHeight = entry.getValue();
//            if (preHeight != curMaxHeight) { // 之前最大高度和当前最大高度不一样时
//                if (preHeight != 0) {
//                    res.add(new ArrayList<>(Arrays.asList(start, curX, preHeight)));
//                }
//                start = curX;
//                preHeight = curMaxHeight;
//            }
//        }
//        return res;
//    }
//    public  class OpComparator implements Comparator<Op> {
//        @Override
//        public int compare(Op o1, Op o2) {
//            if (o1.x != o2.x) {
//                return o1.x - o2.x;
//            }
//            if (o1.isAdd != o2.isAdd) {
//                return o1.isAdd ? -1 : 1;
//            }
//            return 0;
//        }
//    }
//    public static class Op {
//        public int x; // x轴上的值
//        public boolean isAdd;// true为加入，false为删除
//        public int h; // 高度
//
//        public Op(int x, boolean isAdd, int h) {
//            this.x = x;
//            this.isAdd = isAdd;
//            this.h = h;
//        }
//    }




            Node[] nodes = new Node[buildings.length * 2];
            for (int i = 0; i < buildings.length; i++) {
                nodes[i * 2] = new Node(buildings[i][0], true, buildings[i][2]);
                nodes[i * 2 + 1] = new Node(buildings[i][1], false, buildings[i][2]);
            }
            Arrays.sort(nodes, new NodeComparator());
            TreeMap<Integer, Integer> mapHeightTimes = new TreeMap<>();
            TreeMap<Integer, Integer> mapXHeight = new TreeMap<>();
            for (int i = 0; i < nodes.length; i++) {
                if (nodes[i].isAdd) {
                    if (!mapHeightTimes.containsKey(nodes[i].h)) {
                        mapHeightTimes.put(nodes[i].h, 1);
                    } else {
                        mapHeightTimes.put(nodes[i].h, mapHeightTimes.get(nodes[i].h) + 1);
                    }
                } else {
                    if (mapHeightTimes.get(nodes[i].h) == 1) {
                        mapHeightTimes.remove(nodes[i].h);
                    } else {
                        mapHeightTimes.put(nodes[i].h, mapHeightTimes.get(nodes[i].h) - 1);
                    }
                }
                if (mapHeightTimes.isEmpty()) {
                    mapXHeight.put(nodes[i].x, 0);
                } else {
                    mapXHeight.put(nodes[i].x, mapHeightTimes.lastKey());
                }
            }
            List<List<Integer>> ans = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : mapXHeight.entrySet()) {
                int curX = entry.getKey();
                int curMaxHeight = entry.getValue();
                if (ans.isEmpty() || ans.get(ans.size() - 1).get(1) != curMaxHeight) {
                    ans.add(new ArrayList<>(Arrays.asList(curX, curMaxHeight)));
                }
            }
            return ans;
        }
        class Node {
            public int x;
            public boolean isAdd;
            public int h;

            public Node(int x, boolean isAdd, int h) {
                this.x = x;
                this.isAdd = isAdd;
                this.h = h;
            }
        }

    class NodeComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            if (o1.x != o2.x) {
                return o1.x - o2.x;
            }
            if (o1.isAdd != o2.isAdd) {
                return o1.isAdd ? -1 : 1;
            }
            return 0;
        }
    }
}
