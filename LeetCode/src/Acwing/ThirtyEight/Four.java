package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T =Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            String[] s = bufferedReader.readLine().split(" ");
            int n =Integer.valueOf(s[0]);
            int k =Integer.valueOf(s[1]);
            String s1 = bufferedReader.readLine();
            HashSet<Character> characters = new HashSet<>();
            char[] chars = s1.toCharArray();
            for (char c : chars) {
                characters.add(c);
            }
            char a[]=new char[characters.size()];
            int l=0;
            for (Character character : characters) {
                a[l++]=character;
            }

            Arrays.sort(a);
            HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
            for (int i = 0; i <a.length ; i++) {
                characterIntegerHashMap.put(a[i],i);
            }
            char b[]=new char[k];
            for (int i = 0; i <Math.min(k ,chars.length); i++) {
                b[i]=chars[i];
            }
            if (k>chars.length)
            {
                for (int i = chars.length; i <k ; i++) {
                    b[i]=a[0];
                }
                System.out.println(new String(b));
            }else {
                for (int i = k - 1; i >= 0; i--) {
                    if (characterIntegerHashMap.get(b[i]) == (a.length - 1)) {
                        continue;
                    } else {
                        Integer integer = characterIntegerHashMap.get(b[i]);
                        b[i] = a[integer + 1];
                        for (int j = i + 1; j < b.length; j++) {
                            b[j] = a[0];
                        }
                        break;
                    }
                }
                System.out.println(new String(b));
            }
        }

    }
}
