package Six;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
public class Ninety {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> integerEmployeeHashMap = new HashMap<>();
        for (int i = 0; i <employees.size() ; i++) {
            if (integerEmployeeHashMap.get(employees.get(i).id)!=null)
            {
                continue;
            }else
            {
                integerEmployeeHashMap.put(employees.get(i).id,employees.get(i));
            }
        }
        HashMap<Integer, Boolean> integerBooleanHashMap = new HashMap<>();

        int sum =0;
        Queue<Integer>a  = new LinkedList<>();
        a.offer(id);
        while (!a.isEmpty())
        {
            Integer poll = a.poll();
            sum+=integerEmployeeHashMap.get(poll).importance;
            integerBooleanHashMap.put(poll,true);
            Employee employee = integerEmployeeHashMap.get(poll);
            for (Integer subordinate : employee.subordinates) {
                if (integerBooleanHashMap.containsKey(subordinate))
                {
                    continue;
                }else
                {
                    a.offer(subordinate);
                }
            }

        }

        return sum;
    }
}
