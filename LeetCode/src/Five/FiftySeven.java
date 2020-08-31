package Five;

public class FiftySeven {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String ss="";
        for (int i = 0; i <s1.length-1 ; i++) {
            ss+=new StringBuffer(s1[i]).reverse()+" ";
        }
        ss+=new StringBuffer(s1[s1.length-1]).reverse();
        return ss;
    }
}
