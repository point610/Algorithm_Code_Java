package LQB.lqb3539;

import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(scan.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());

        long sum = 0;
        while (!list.isEmpty()) {
            if (list.size() == 2) {
                sum += list.get(0);
                sum += list.get(1);
                break;
            }
            if (list.size() == 1) {
                sum += list.get(0);
                break;
            }
            int one = list.get(0);
            int two = list.get(1);
            sum += one;
            sum += two;

            list.remove(0);
            list.remove(1);

            int temp = two / 2;
            int index = Integer.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= temp) {
                    index = i;
                    break;
                }
            }
            if (index < list.size()) {
                list.remove(index);
            }
        }

        System.out.println(sum);
        scan.close();
    }
}













