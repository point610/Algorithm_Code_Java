package NKW_HW.two.HJ101;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(scanner.nextInt());
            }
            if (scanner.nextInt() == 1) {
                Collections.sort(list, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                });
            } else {
                Collections.sort(list);
            }
            for (int i = 0; i < size; i++) {
                System.out.print(list.get(i));
                System.out.print(' ');
            }
        }
    }
}