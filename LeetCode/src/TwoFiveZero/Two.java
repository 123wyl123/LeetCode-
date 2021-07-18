package TwoFiveZero;

public class Two {
    public int addRungs(int[] rungs, int dist) {
        int l=0;
        int pre =0;
        int temp=0;
        while (l<rungs.length)
        {
            if (rungs[l]-pre<=dist)
            {  pre =rungs[l];
                l++;

            }else
            {
                int pre1 = rungs[l]-pre-1;
                temp=temp+(pre1/dist);
                pre = pre+((pre1/dist))*dist;
            }
        }
        return temp;
    }

    public static void main(String[] args) {

    }
}
