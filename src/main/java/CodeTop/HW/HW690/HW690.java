package CodeTop.HW.HW690;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName HW690
 * @Description TODO
 * @Author point
 * @Date 2023/12/23 22:12
 * @Version 1.0
 */
class Employee {
    public int id;

    public int importance;

    public List<Integer> subordinates;
}

class Solution {
    private Map<Integer, Employee> map = new HashMap<>();

    int sum = 0;

    void DFS(Employee employee) {
        if (employee == null) {
            return;
        }
        sum += employee.importance;
        for (Integer id : employee.subordinates) {
            DFS(map.get(id));
        }

    }

    public int getImportance(List<Employee> employees, int id) {
        for (Employee ee : employees) {
            map.put(ee.id, ee);
        }DFS(map.get(id));
return sum;
    }
}

public class HW690 {
}
