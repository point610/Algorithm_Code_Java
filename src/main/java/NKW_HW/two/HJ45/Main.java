
package NKW_HW.two.HJ45;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }


    private static int get(String one) {
        int[] list = new int[26];
        for (char cc : one.toCharArray()) {
            list[cc - 'a']++;
        }
        Arrays.sort(list);
        int index = 26;
        int sum = 0;
        for (int i = 25; i >= 0 && list[i] != 0; i--) {
            sum += index * list[i];
            index--;
        }

        return sum;
    }

    public static void solution(Scanner scanner) {
        int size = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.println(get(scanner.nextLine()));
        }
    }
}












