package NKW_HW.one.HJ48;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            list.add(scanner.nextInt());
            for (int i = 0; i < size - 1; i++) {
                int value = scanner.nextInt();
                int p = scanner.nextInt();
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) == p) {
                        list.add(j+1, value);
                        break;
                    }
                }
            }
            int removevalue = scanner.nextInt();
            for (int i = 0; i < size; i++) {
                if (list.get(i) == removevalue) {
                    continue;
                }
                System.out.print(list.get(i));
                System.out.print(' ');
            }

        }
    }
}