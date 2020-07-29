package Ten;

public class SevenTyNine {
    int res;
    public int numTilePossibilities(String tiles) {
        int a[] = new int [26];
        for (int i = 0; i <tiles.length() ; i++) {
            a[tiles.charAt(i)-'A'] =  a[tiles.charAt(i)-'A']+1;
        }
            res =0;
            god(a);
return res;

    }
    public void god(int a[])
    {

        for (int i = 0; i <a.length ; i++) {

            if(a[i]==0)
            {
                continue;
            }
            res+=1;
            a[i]=a[i]-1;
           god(a);
           a[i] = a[i]+1;
        }
    return;
    }

}
