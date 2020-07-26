package Oneninenine;

public class Two {
    public int minFlips(String target) {
        char a [] = new char[target.length()];
        int j=0;
        if(target.charAt(0)=='0')
        {

        } else
        {
            a[0]='1';
            j++;
        }
        for (int i = 1; i <target.length() ; i++) {

            if(target.charAt(i)==target.charAt(i-1))
            {

            }else
            {
                a[j]=target.charAt(i);
                j++;
            }
        }
       return j;

    }
}
