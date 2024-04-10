package LQB.lqb3552;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    private static long sum;

    public static void main(String[] args) {
        sum = 0;
        templist = new ArrayList<>();
        List<Integer> start = new ArrayList<>();
        start.add(1);
        start.add(0);
        start.add(1);
        start.add(0);
        start.add(1);
        dfs(start);
        System.out.println(sum);
    }

    private static List<List<Integer>> templist;

    private static void dfs(List<Integer> list) {
        if (list.size() == 1) {
            if (list.get(0) == 1) {
                sum++;
            }
            return;
        }
        tempdfs(list, 0, new ArrayList<>());
        List<List<Integer>> temp = new ArrayList<>(templist);
        templist = new ArrayList<>();
        for (List<Integer> integers : temp) {
            dfs(integers);
        }

    }


    private static void tempdfs(List<Integer> list, int index, List<Integer> temp) {
        if (index == list.size() - 1) {
            templist.add(new ArrayList<>(temp));
            return;
        }

        temp.add(yu(list.get(index), list.get(index + 1)));
        tempdfs(list, index + 1, temp);
        temp.remove(temp.size() - 1);

        temp.add(huo(list.get(index), list.get(index + 1)));
        tempdfs(list, index + 1, temp);
        temp.remove(temp.size() - 1);

        temp.add(yihuo(list.get(index), list.get(index + 1)));
        tempdfs(list, index + 1, temp);
        temp.remove(temp.size() - 1);

    }

    private static int yu(int one, int two) {
        return one | two;
    }

    private static int huo(int one, int two) {
        return one & two;
    }

    private static int yihuo(int one, int two) {
        return one ^ two;
    }
}