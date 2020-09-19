package Two;

public class FourtyTwo {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
        {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        int a[] = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            a[s.charAt(i)-'a']++;
        }
        for (int i = 0; i <t.length() ; i++) {
            a[t.charAt(i)-'a']--;
        }
        for (int i : a) {
            if (i!=0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new FourtyTwo().isAnagram("a","b");
    }
}
