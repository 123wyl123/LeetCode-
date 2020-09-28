package TwoZeroEigth;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ThroneInheritance {
    public String kingname;
    public Deque <String> a = new LinkedList<>();
    public ThroneInheritance(String kingName) {
        this.kingname = kingName;
    }

    public void birth(String parentName, String childName) {
      Deque <String> b = new LinkedList<>();
        while (a.getLast()!=parentName)
        {
            String s = a.removeLast();
            b.addLast(s);
        }
        a.addLast(childName);
        while (!b.isEmpty())
        {
            a.addLast(b.removeLast());
        }
    }

    public void death(String name) {
        Deque <String> b = new LinkedList<>();
        while (a.getLast()!=name)
        {
            String s = a.removeLast();
            b.addLast(s);

        }
       b.removeLast();
        while (!b.isEmpty())
        {
            a.addLast(b.removeLast());
        }
    }

    public List<String> getInheritanceOrder() {
        LinkedList<String> strings = new LinkedList<>();
        for (String s : a) {
            strings.add(s);
        }
        return strings;
    }
}
