package TwoZeroSix;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Three {
    public int minCostConnectPoints(int[][] points) {
        int result = 0;
        HashSet<Integer> integers = new HashSet<>();
        int length = points.length;
        PriorityQueue<m> ms = new PriorityQueue<m>(new Comparator<m>() {
            @Override
            public int compare(m o1, m o2) {
                return o1.c1 - o2.c1;
            }
        });
        for (int i = 0; i < length; i++) {


            if (!integers.contains(i)) {
                integers.add(i);
                for (int j = 0; j < length; j++) {
                    if (integers.contains(j)) {
                        continue;
                    } else {
                        m m = new m(i, j, Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]));
                        ms.add(m);
                    }
                }
                while (!ms.isEmpty()) {
                    m poll = ms.poll();
                    int b1 = poll.getB1();
                    if (!integers.contains(b1)) {
                        integers.add(b1);
                        result += poll.c1;
                        for (int j = 0; j < length; j++) {
                            if (integers.contains(j)) {
                                continue;
                            } else {
                                m m = new m(i, j, Math.abs(points[b1][0] - points[j][0]) + Math.abs(points[b1][1] - points[j][1]));
                                ms.add(m);
                            }
                        }
                    }

                }
            }

        }
        return result;

    }

    class m {
        private int a1;
        private int b1;
        private int c1;

        public m(int a, int b, int c) {
            this.a1 = a;
            this.b1 = b;
            this.c1 = c;
        }

        public int getA1() {
            return this.a1;
        }

        public int getB1() {
            return this.b1;
        }
    }
}
