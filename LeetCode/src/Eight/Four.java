package Eight;

import java.util.TreeSet;

public class Four {
    public int uniqueMorseRepresentations(String[] words) {
        String a[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String> strings = new TreeSet<>();
        for (int i = 0; i <words.length ; i++) {
            String aa ="";
            for (int j = 0; j <words[i].length() ; j++) {
                aa+=a[words[i].charAt(j)-'a'];
            }
            strings.add(aa);
        }
return strings.size();



    }
}
