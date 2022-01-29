package Twenty;

public class FourtySeven {
    public int countValidWords(String sentence) {
        String[] s = sentence.split(" ");
        int sum =0;
        for (int i = 0; i <s.length ; i++) {
            String string = s[i];
            System.out.println(string);
            char[] chars = string.toCharArray();
            int lian = 0;
            boolean flag = false;
            if (chars.length==0)
            {
                flag=true;
            }
            for (int j = 0; j <chars.length ; j++) {
                if (chars[j]=='-')
                {
                    lian++;
                    if (lian!=1)
                    {   flag = true;
                        break;
                    }else
                    {
                        if (j-1>=0&&(chars[j-1]>='a'&&chars[j-1]<='z')&&j+1<chars.length&&(chars[j+1]>='a'&&chars[j+1]<='z'))
                        {
                            continue;
                        }else
                        {
                            flag = true;
                            break;
                        }
                    }
                }else if (chars[j]=='!'||chars[j]=='.'||chars[j]==',')
                {
                    if (j==chars.length-1)
                    {
                        continue;
                    }else
                    {   flag = true;
                        break;
                    }
                }else if (chars[j]>='0'&&chars[j]<='9')
                {   flag = true;
                    break;
                }
            }
            if (!flag)
            {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        new FourtySeven().countValidWords("cat and  dog");
    }
}