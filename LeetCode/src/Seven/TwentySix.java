package Seven;

import java.util.*;

public class TwentySix {
    public String countOfAtoms(String formula) {
        char[] chars = formula.toCharArray();
        Deque<HashMap<String, Integer>> aa = new LinkedList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        HashMap<String, Integer> HashMap = new HashMap<>();
        while (i < chars.length) {

            if (chars[i] == ')') {
                int temp = 0;
                while (i + 1 < chars.length && chars[i + 1] >= '0' && chars[i + 1] <= '9') {
                    temp =temp*10+ chars[i + 1] - '0';
                    i++;
                }
                if (temp==0)
                {
                    temp=1;
                }
                HashMap<String, Integer> pop = aa.pop();
                if (pop.size() == 0) {
                    for (String s : HashMap.keySet()) {
                        pop.put(s, pop.getOrDefault(s, 0) + HashMap.get(s)*temp);
                    }
                    HashMap = pop;
                    i++;

                } else {
                    for (String s : HashMap.keySet()) {
                        pop.put(s, pop.getOrDefault(s, 0) + HashMap.get(s)*temp);
                    }
                    HashMap = pop;
                    i++;
                }


            } else {
                if (aa.isEmpty()&&HashMap.size()==0) {
                    HashMap = new HashMap<>();
                    if (chars[i] == '(') {
                        aa.push(HashMap);
                        HashMap = new HashMap<>();
                        i++;
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        if (chars[i] >= 'A' && chars[i] <= 'Z') {
                            stringBuffer.append(chars[i]);
                            i++;
                        }
                        for (; i < chars.length; i++) {
                            if ((chars[i] >= 'a' && chars[i] <= 'z')) {
                                stringBuffer.append(chars[i]);
                            } else {
                                break;
                            }
                        }
                        int tem=0;
                        while (i<chars.length&&chars[i] >= '0' && chars[i] <= '9') {

                            tem=tem*10+chars[i]-'0';
                            i++;
                        }
                        if (tem==0)
                        {
                            HashMap.put(stringBuffer.toString(),HashMap.getOrDefault(stringBuffer.toString(),0)+1);
                        }else
                        {
                            HashMap.put(stringBuffer.toString(),HashMap.getOrDefault(stringBuffer.toString(),0)+tem);
                        }
                    }
                } else {
                    if (chars[i] == '(') {
                        aa.push(HashMap);
                        HashMap = new HashMap<>();
                        i++;
                    } else {
                        StringBuffer stringBuffer = new StringBuffer();
                        if (chars[i] >= 'A' && chars[i] <= 'Z') {
                            stringBuffer.append(chars[i]);
                            i++;
                        }
                        for (; i < chars.length; i++) {
                            if ((chars[i] >= 'a' && chars[i] <= 'z')) {
                                stringBuffer.append(chars[i]);
                            } else {
                                break;
                            }
                        }
                        int tem=0;
                        while (i<chars.length&&chars[i] >= '0' && chars[i] <= '9') {
                            tem=tem*10+chars[i]-'0';
                            i++;
                        }
                        if (tem==0)
                        {
                            HashMap.put(stringBuffer.toString(),HashMap.getOrDefault(stringBuffer.toString(),0)+1);
                        }else
                        {
                            HashMap.put(stringBuffer.toString(),HashMap.getOrDefault(stringBuffer.toString(),0)+tem);
                        }
                    }
                }
            }

        }
        while (!aa.isEmpty()) {

            HashMap<String, Integer> pop = aa.pop();
            if (pop.size()==0) {
                continue;
            }else {
                for (String s : pop.keySet()) {
                    HashMap.put(s,HashMap.getOrDefault(s,0)+pop.get(s));
                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer();

        TreeMap stringTreeMap = new TreeMap<String,Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (int j = 0; j < Math.min(o1.length(), o2.length()); j++) {
                    if (o1.charAt(j) < o2.charAt(j)) {
                        return -1;
                    } else if (o1.charAt(j) == o2.charAt(j)) {
                        continue;
                    } else {
                        return 1;
                    }
                }
                if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        for (String s : HashMap.keySet()) {
            stringTreeMap.put(s,HashMap.get(s));
        }
        while (!stringTreeMap.isEmpty())
        {
            Map.Entry entry = stringTreeMap.pollFirstEntry();
            String key = (String) entry.getKey();
            Integer value = (Integer) entry.getValue();
            if (value==1)
            {
                stringBuffer.append(key);
            }else
            {
                stringBuffer.append(key);
                stringBuffer.append(value);
            }
        }
        return stringBuffer.toString();
    }


    public static void main(String[] args) {
        new TwentySix().countOfAtoms("(NB3)33");
    }
    }

