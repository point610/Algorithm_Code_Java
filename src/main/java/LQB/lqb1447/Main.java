package LQB.lqb1447;


import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {

    private static Set<Integer> set;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        set = new HashSet<>();
        int size = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(scan.nextInt());
        }

        set.add(0);
        for (Integer integer : list) {
            List<Integer> templist = new ArrayList<>(set);
            for (Integer i : templist) {
                set.add(Math.abs(i - integer));
                set.add(i + integer);
            }
        }
        set.remove(0);
        System.out.println(set.size());
        scan.close();
    }


}