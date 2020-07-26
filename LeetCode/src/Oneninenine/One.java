package Oneninenine;

public class One {
    public String restoreString(String s, int[] indices) {
            char a[] = new char[s.length()];
        for (int i = 0; i <s.length() ; i++) {
        a[indices[i]] =   s.charAt(i);
        }
        String s1 ="";
        for (char c : a) {
            s1+=c;
        }
        return s1;
    }
}
