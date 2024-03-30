package NKW_HW.one.HJ101;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }
        int type = scanner.nextInt();
        if (type == 0) {
            Collections.sort(list);
        } else if (type == 1) {
            Collections.sort(list, (o1, o2) -> o2 - o1);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
    }
}