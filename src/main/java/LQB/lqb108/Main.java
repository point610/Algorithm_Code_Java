package LQB.lqb108;

import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    private static Map<Integer, List<Integer>> map;
    private static boolean[] visit;
    private static boolean find;
    private static List<Integer> res;

    private static void dfs(List<Integer> list, int one) {
        if (find) {
            return;
        }
        if (visit[one]) {
            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == one) {
                    index = i;
                    break;
                }
            }

            for (int i = index; i < list.size(); i++) {
                res.add(list.get(i));
            }
            find = true;
            return;
        }
        visit[one] = true;
        list.add(one);
        for (int i = 0; i < map.get(one).size(); i++) {
            dfs(list, map.get(one).get(i));
        }
        list.remove(list.size() - 1);
        visit[one] = false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        map = new HashMap<>();
        res = new ArrayList<>();
        find = false;
        int size = scan.nextInt();
        visit = new boolean[size];
        for (int i = 0; i < size; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i = 0; i < size; i++) {
            int one = scan.nextInt() - 1;
            int two = scan.nextInt() - 1;
            map.get(one).add(two);
        }
        for (int i = 0; i < size; i++) {
            if (!find) {
                dfs(new ArrayList<>(), i);
            } else {
                break;
            }
        }
        Collections.sort(res);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            stringBuilder.append(res.get(i) + 1 + " ");
        }
        System.out.println(stringBuilder);
        scan.close();
    }
}