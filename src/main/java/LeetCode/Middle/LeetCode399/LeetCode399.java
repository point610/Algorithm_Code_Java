package LeetCode.Middle.LeetCode399;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName LeetCode399
 * @Description TODO
 * @Author point
 * @Date 2023/11/13 23:31
 * @Version 1.0
 */
class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int tempindex = 0;
        Map<String, Integer> map = new HashMap<>();
        int size = equations.size();
        for (int i = 0; i < size; i++) {
            String one = equations.get(i).get(0);
            String two = equations.get(i).get(1);
            if (!map.containsKey(one)) {
                map.put(one, tempindex++);
            }
            if (!map.containsKey(two)) {
                map.put(two, tempindex++);
            }
        }

        // 使用Floyd 算法
        double[][] graph = new double[tempindex][tempindex];
        for (int i = 0; i < tempindex; i++) {
            Arrays.fill(graph[i], -1.0);
        }

        // 边的数值
        for (int i = 0; i < size; i++) {
            String one = equations.get(i).get(0);
            String two = equations.get(i).get(1);
            graph[map.get(one)][map.get(two)] = values[i];
            graph[map.get(two)][map.get(one)] = 1.0 / values[i];
        }

        // 开始Floyd
        for (int i = 0; i < tempindex; i++) {
            for (int j = 0; j < tempindex; j++) {
                for (int k = 0; k < tempindex; k++) {
                    if (graph[j][i] > 1e-6 && graph[i][k] > 1e-6) {
                        graph[j][k] = graph[j][i] * graph[i][k];
                    }
                }
            }
        }
        int quesize = queries.size();
        double[] res = new double[quesize];
        for (int i = 0; i < quesize; i++) {
            double temp = -1.0;
            List<String> list = queries.get(i);
            String one = list.get(0);
            String two = list.get(1);
            if (map.containsKey(one) && map.containsKey(two)) {
                int a = map.get(one);
                int b = map.get(two);
                if (graph[a][b] > 0) {
                    temp = graph[a][b];
                }
            }
            res[i] = temp;
        }
        return res;
    }
}

public class LeetCode399 {
}
