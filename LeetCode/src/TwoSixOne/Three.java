package TwoSixOne;

public class Three {
    int cnt[]=new int[3];
    public boolean stoneGameIX(int[] stones) {

        for (int i = 0; i <stones.length ; i++) {
            cnt[stones[i]%3]+=1;
        }
    if (check(1)||check(2))
    {
        return true;
    }
  return false;
    }

    boolean check (int start)
    {   int mem[]=new int[3];
        for (int i = 0; i <3 ; i++) {
            mem[i]=cnt[i];
        }
        if (mem[start]==0)
        {
            return false;
        }
        int cur =start;
        mem[start]-=1;
        int turn=1;
        while (true)
        {
            if (mem[cur]>0)
            {
                mem[cur]-=1;
                cur=(cur+cur)%3;
            }else if (mem[0]>0)
            {
                mem[0]-=1;
            }else {break;}
            turn=1-turn;
        }
        if (mem[0]+mem[1]+mem[2]==0)return false;
        return turn==1;
    }
}