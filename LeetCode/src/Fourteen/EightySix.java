package Fourteen;

public class EightySix {
    public int xorOperation(int n, int start) {
        int a = 0;
        for (int i = 0; i <n ; i++) {
            a = a^(start+2*i);
        }
        return a;
    }
}

