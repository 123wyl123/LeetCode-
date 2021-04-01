package Ten;

import java.util.Deque;
import java.util.LinkedList;

public class Six {
    public int clumsy(int N) {
        Deque<Integer> a = new LinkedList<>();
        int i =0;
        a.push(N);
        N--;
        while (N>0)
        {
            switch (i%4)
            {
                case 0:
                    Integer pop = a.pop();
                    pop=pop*N;
                    a.push(pop);
                    break;
                case 1:
                    Integer pop1 = a.pop();
                    pop1=pop1/N;
                    a.push(pop1);
                    break;
                case 2:
                    a.push(N);
                    break;
                case 3:
                    a.push(-N);
                    break;
            }
            N--;
            i++;
        }
        int sum =0;
        for (Integer integer : a) {
            sum+=integer;
        }
        return sum;
    }
}
