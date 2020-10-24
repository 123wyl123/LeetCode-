package Four;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Six {
    public int[][] reconstructQueue(int[][] people) {
        if (people.length==0)
        {
            return people;
        }
        Arrays.sort(people,(int[]a,int[]b)->

                {
                    if (a[0]!=b[0])
                    {
                        return a[0]<b[0]?1:-1;
                    }
                    return a[1]>b[1]?1:-1;
                }
                );


        for (int i = 1; i <people.length ; i++) {
           if (people[i][1]>=i)
           {
               continue;
           }else
           {        int k = people[i][1];
               for (int j = i; j >k ; j--) {
                   if (people[j][0]<people[j-1][0])
                   {
                       int temp = people[j][0];
                       people[j][0] = people[j-1][0];
                       people[j-1][0] = temp;
                       temp = people[j][1];
                       people[j][1] = people[j-1][1];
                       people[j-1][1] = temp;
                   }
               }
           }
        }
    return people;
    }
    public int[][] reconstructQueue1(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        List<int[]> list=new LinkedList<>();
        for(int[] p:people)
            list.add(p[1],p);
        return list.toArray(people);
    }
    public static void main(String[] args) {
        int a[][] ={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        new Six().reconstructQueue1(a);
    }
}
