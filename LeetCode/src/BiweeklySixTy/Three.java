package BiweeklySixTy;

import java.util.HashMap;
import java.util.LinkedList;

 class LockingTree {
    int a[];
    int lock[];
    HashMap<Integer, LinkedList<Integer>> ab= new HashMap<>();
    public LockingTree(int[] parent) {
      a=parent;
      lock=new int[parent.length];
        for (int i = 0; i <a.length ; i++) {
            if (ab.containsKey(a[i]))
            {
                LinkedList<Integer> integers = ab.get(a[i]);
                integers.addLast(i);
                ab.put(a[i],integers);
            }else
            {
                LinkedList<Integer> integers = new LinkedList<>();
                integers.addLast(i);
                ab.put(a[i],integers);
            }
        }


    }

    public boolean lock(int num, int user) {
        if (lock[num]==0)
        {
            lock[num]=user;
            return true;
        }
        return false;
    }

    public boolean unlock(int num, int user) {
        if (lock[num]==user)
        {   lock[num]=0;
            return true;
        }
        return false;
    }

    public boolean upgrade(int num, int user) {
        if (lock[num]!=0)
        {
            return false;
        }
       if (fu(a[num]))
       {
            int temp=0;
            if (ab.get(num)==null)
            {
                return false;
            }
           for (Integer integer : ab.get(num)) {
               temp+=jiesuo(integer);
           }
       if (temp==0)
       {
           return false;
       }else
       {    lock[num]=user;
           return true;
       }
       }else
       {
           return false;
       }
    }
    public int jiesuo(int num)
    {   if (num>=a.length)
    {
        return 0;
    }
    int temp=0;
        for (Integer integer : ab.get(num)) {
            temp+=jiesuo(integer);
        }
      if (lock[num]!=0)
      { lock[num]=0;
        temp++;
      }
      return temp;
    }

    public boolean fu(int num)
    {        if (num<0)
    {
        return true;
    }

        if (num==0)
    {
        if(lock[num]==0)
        {
            return true;
        }else
        {
            return false;
        }
    }
        if (lock[num]!=0)
        {
            return false;
        }else
        {
            return fu(a[num]);
        }
    }

}
