package Nine;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class EightyOne {
    HashMap<String, TreeMap<Integer,String>>a=  new HashMap<String, TreeMap<Integer,String>>();
    public EightyOne() {

    }

    public void set(String key, String value, int timestamp) {
        if (a.containsKey(key))
        {
            TreeMap<Integer, String> integerStringTreeMap = a.get(key);
            integerStringTreeMap.put(timestamp,value);
        }else
        {
            TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>();
            integerStringTreeMap.put(timestamp,value);
            a.put(key,integerStringTreeMap);
        }
    }

    public String get(String key, int timestamp) {
        if (a.containsKey(key)) {


            TreeMap<Integer, String> integerStringTreeMap = a.get(key);
            if (integerStringTreeMap.floorKey(timestamp) != null) {
                Integer integer = integerStringTreeMap.floorKey(timestamp);
                return integerStringTreeMap.get(integer);
            } else {
                return "";
            }
        }
        return "";
    }
}
