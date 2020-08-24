package Four;

public class FiftyNine {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i * 2 <=n; i++) {
            if(n % i == 0) {
                boolean dd = true;
                for (int j = i; j < n; j++) {
                    if(s.charAt(j)!=s.charAt(j-i))
                    {   dd = false;
                        break;
                    }

                }
                if(dd)
                {
                    return true;
                }

            }


        }

        return false;
    }
}
