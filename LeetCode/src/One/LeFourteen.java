package One;

public class LeFourteen {
    public String longestCommonPrefix(String[] strs) {
        String[] str = new String[strs.length];
        str[0] = strs[0];
        for(int i =0;i<strs.length-1;i++)
        {
            for(int j=0;j<str[i].length();j++) {
                if(j>=strs[i+1].length())
                {
                    break;
                }
            if(str[i].charAt(j)==strs[i+1].charAt(j))
            {   if(str[i+1]==null)
            {
                str[i+1] = String.valueOf(str[i].charAt(j));
            }
            else {
                str[i + 1] = str[i + 1] + strs[i + 1].charAt(j);
            }
            }
            else
            {
                break;
            }
        }

        }
        return str[str.length-1];
    }

    public static void main(String[] args) {
        String[] a ={"flower","flow","flight"};
    String b=   new LeFourteen().longestCommonPrefix(a);
        int c =11;
    }
}
