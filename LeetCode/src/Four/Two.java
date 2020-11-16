package Four;

import java.util.Deque;
import java.util.LinkedList;

public class Two {

    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        Deque<Integer> a = new LinkedList<>();
        int kk = 0;
        char[] chars = num.toCharArray();
        for (int i = 0; i < num.length(); i++) {
            if (a.isEmpty()) {
                a.push(i);
            } else if (chars[a.peek()] <= chars[i]) {
                a.push(i);
            } else {
                while (!a.isEmpty() && chars[a.peek()] > chars[i]) {
                    Integer pop = a.pop();
                    kk++;
                    if (kk == k) {
                        int size = a.size();

                        StringBuffer stringBuffer = new StringBuffer();

                        for (int j = 0; j < size; j++) {
                            if (stringBuffer.length() == 0 && chars[a.getLast()] == '0') {
                                a.removeLast();
                                continue;
                            }
                            stringBuffer.append(chars[a.removeLast()]);
                        }

                        for (int j = i; j < num.length(); j++) {
                            if (stringBuffer.length() == 0 && chars[j] == '0') {
                                continue;
                            }
                            stringBuffer.append(chars[j]);
                        }
                        if (stringBuffer.length() == 0) {
                            return "0";
                        }

                        return stringBuffer.toString();
                    }

                }
                a.push(i);
            }


        }
        int size = a.size();
        if (size == 0) {
            return "0";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < num.length() - k; i++) {
                if (stringBuffer.length() == 0 && chars[a.getLast()] == '0') {
                    a.removeLast();
                    continue;
                }
                stringBuffer.append(chars[a.removeLast()]);
            }
            if (stringBuffer.length() == 0) {
                return "0";
            }

            return stringBuffer.toString();
        }


    }



}
