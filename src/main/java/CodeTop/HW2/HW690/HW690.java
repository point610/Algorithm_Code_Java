package CodeTop.HW2.HW690;

import java.util.*;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }

        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(id);
        while (!queue.isEmpty()) {
            Queue<Integer> qqq = new LinkedList<>();
            while (!queue.isEmpty()) {
                Integer temp = queue.poll();
                sum += map.get(temp).importance;
                qqq.addAll(map.get(temp).subordinates);
            }
            queue = qqq;
        }

        return sum;
    }
}

public class HW690 {
}
