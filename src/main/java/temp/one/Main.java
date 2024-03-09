package temp.one;

// 本题为考试单行多行输入输出规范示例，无需提交，不计分。

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int change = scanner.nextInt();
        scanner.nextLine();
        String ss = scanner.nextLine();
        int is = 0;
        int not = 0;
        for (int i = 0; i < size; i++) {
            if (ss.charAt(i) == 'M' || ss.charAt(i) == 'T') {
                is++;
            } else {
                not++;
            }
        }
        System.out.println(is + Math.min(not, change));
    }
}