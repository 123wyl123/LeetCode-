package Acwing.ThirtySix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TwentyFour {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int T = Integer.valueOf(s);
        while (T>0) {
            T--;
            HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
            String s1 = bufferedReader.readLine();
            int max = Integer.MAX_VALUE;
            for (int i = 0; i < s1.length(); i++) {
                characterIntegerHashMap.put(s1.charAt(i), i);
                if (characterIntegerHashMap.size() == 3) {
                    int min = Integer.MAX_VALUE;
                    int Max = 0;
                    for (Character character : characterIntegerHashMap.keySet()) {
                        Integer integer = characterIntegerHashMap.get(character);
                        min = Math.min(integer, min);
                        Max = Math.max(Max, characterIntegerHashMap.get(character));

                    }
                    max = Math.min(max, Max - min + 1);
                }
            }
            if (characterIntegerHashMap.size() < 3)
            {
                System.out.println(0);
            }else
            {
                System.out.println(max);
            }

        }
    }
}
