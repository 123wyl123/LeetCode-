package One;

import java.util.*;

public class TwentySeven {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        wordList.add(beginWord);
        HashMap<String, ArrayList<String>> nexts = getNexts(wordList);
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        Queue <String > a = new LinkedList<>();
        a.offer(beginWord);
        stringIntegerHashMap.put(beginWord,0);
        while (!a.isEmpty())
        {
            String poll = a.poll();
            Integer integer = stringIntegerHashMap.get(poll);
            for (String s : nexts.get(poll)) {
                if (stringIntegerHashMap.containsKey(s))
                {

                }else
                {
                    a.offer(s);
                    stringIntegerHashMap.put(s,integer+1);
                }

            }
        }
return stringIntegerHashMap.containsKey(endWord)?stringIntegerHashMap.get(endWord)+1:0;
    }
    public static HashMap<String, ArrayList<String>> getNexts(List<String> words) {
        Set<String> dict = new HashSet<>(words); // List 所有东西放入 set
        HashMap<String, ArrayList<String>> nexts = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            nexts.put(words.get(i), getNext(words.get(i), dict));
        }
        return nexts;
    }
    private static ArrayList<String> getNext(String word, Set<String> dict) {
        ArrayList<String> res = new ArrayList<String>();
        char[] chs = word.toCharArray();
        for (char cur = 'a'; cur <= 'z'; cur++) {
            for (int i = 0; i < chs.length; i++) {
                if (chs[i] != cur) {
                    char tmp = chs[i];
                    chs[i] = cur;
                    if (dict.contains(String.valueOf(chs))) {
                        res.add(String.valueOf(chs));
                    }
                    chs[i] = tmp;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("hot");
        strings.add("dot");
        strings.add("dog");
        strings.add("lot");
        strings.add("log");
        strings.add("cog");

        new TwentySeven().ladderLength("hit","cog",strings);


    }
}

