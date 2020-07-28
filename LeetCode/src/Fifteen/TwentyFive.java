package Fifteen;

import java.util.HashSet;

public class TwentyFive {
    public int numSplits(String s) {
        int size = 26;
        int[] leftCount = new int[size];
        int[] rightCount = new int[size];
        int leftVaild = 0;
        int rightVaild = 0;

        for(char ch : s.toCharArray()){
            int num = ch - 'a';
            if(rightCount[num] == 0){
                rightVaild++;
            }
            rightCount[num]++;
        }

        int c = 0;

        for(char ch : s.toCharArray()){
            int num = ch - 'a';

            if(leftCount[num] == 0){
                leftVaild++;
            }

            if(rightCount[num] == 1){
                rightVaild--;
            }
            leftCount[num]++;
            rightCount[num]--;
            if(leftVaild == rightVaild){
                c++;
            }
        }
        return c;

    }
    public int numSplits1(String s)
    {
        HashSet<Character> objects = new HashSet<>();
        HashSet<Character> objects1 = new HashSet<>();
        int [] a = new int[s.length()];
        int [] b=  new int[s.length()];


        for (int i = 0,j=s.length()-1; i <s.length() ; i++) {
            objects.add(s.charAt(i));
            objects1.add(s.charAt(j));
            a[i] = objects.size();
            b[j] = objects1.size();
        }
        int res=0;
        for (int i = 0; i <s.length() ; i++) {
            if(a[i]==b[i+1])
            {
                res++;
            }
        }
        return res;
    }

}
