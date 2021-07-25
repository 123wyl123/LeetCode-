package BiweeklyFourtySeven;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Two {
    public int smallestChair(int[][] times, int targetFriend) {
        int[] time = times[targetFriend];
        int start=time[0];
        int end = time[1];
        int a[]=new int[times.length];
       Integer b[][]=new Integer[times.length][2];
        for (int i = 0; i <times.length ; i++) {
            for (int j = 0; j <2 ; j++) {
                b[i][j]=times[i][j];
            }
        }
        Arrays.sort(b, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0]!=o2[0]) {
                    return o1[0] - o2[0];
                }else
                {
                    return o1[1]-o2[1];
                }
            }
        });
        PriorityQueue<Integer[]> integers = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1] - o2[1];
            }
        }
        );

        PriorityQueue<Integer> integers1 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }
        );


        int temp=0;
        HashMap<String, Integer> stringBufferIntegerHashMap = new HashMap<>();
        for (int i = 0; i <b.length ; i++) {

            if (integers.size()==0)
            {
                integers.add(b[i]);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(b[i][0]);
                stringBuffer.append("-");
                stringBuffer.append(b[i][1]);
                stringBufferIntegerHashMap.put(stringBuffer.toString(),0);
            }else
            {
                while (integers.size()!=0&&integers.peek()[1]<=b[i][0])
                {
                    Integer[] poll = integers.poll();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(poll[0]);
                    stringBuffer.append("-");
                    stringBuffer.append(poll[1]);
                    Integer integer = stringBufferIntegerHashMap.get(stringBuffer.toString());
                    integers1.add(integer);
                }
                integers.add(b[i]);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(b[i][0]);
                stringBuffer.append("-");
                stringBuffer.append(b[i][1]);
                Integer poll = integers1.poll();
                stringBufferIntegerHashMap.put(stringBuffer.toString(),poll==null?integers.size()-1:poll);
            }
            if (start==b[i][0]&&end==b[i][1])
            { StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(b[i][0]);
                stringBuffer.append("-");
                stringBuffer.append(b[i][1]);
                return stringBufferIntegerHashMap.get(stringBuffer.toString());
            }
        }

        return -1;


    }

    public static void main(String[] args) {
        int a[][]={{33889,98676},{80071,89737},{44118,52565},{52992,84310},{78492,88209},{21695,67063},{84622,95452},{98048,98856},{98411,99433},{55333,56548},{65375,88566},{55011,62821},{48548,48656},{87396,94825},{55273,81868},{75629,91467}};


        int i = new Two().smallestChair(a,6 );
    }
}
