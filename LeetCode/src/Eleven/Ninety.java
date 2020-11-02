package Eleven;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Ninety {
    public String reverseParentheses(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> a = new LinkedList<>();
        for (int i = 0; i <s.length(); i++) {
            if (chars[i]=='(')
            {
                a.push(chars[i]);
            }else if (chars[i]==')')
            {
                LinkedList<Character> characters = new LinkedList<>();
                while (!a.isEmpty()&&a.peek()!='(')
                {
                    Character pop = a.pop();
                    characters.add(pop);
                }
                if (a.peek()=='(')
                {
                    a.pop();
                }
                while (!characters.isEmpty())
                {
                    Character character = characters.removeFirst();
                    a.push(character);
                }
            }else
            {
                a.push(chars[i]);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!a.isEmpty())
        {
            stringBuffer.append(a.removeFirst());
        }
        return stringBuffer.reverse().toString();
    }
    public String reverseParentheses1(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        int[] pair = new int[n];

        //先去找匹配的括号
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int j = stack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        StringBuilder res = new StringBuilder();
        // i是当前位置 | d是方向,1就是向右穿
        for (int i = 0, d = 1; i < n; i+=d) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                // 如果碰到括号，那么去他对应的括号，并且将方向置反
                i = pair[i];
                d = -d;
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        new Ninety().reverseParentheses("a(bcdefghijkl(mno)p)q");
    }
}
