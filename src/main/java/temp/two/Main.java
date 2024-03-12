package temp.two;


import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int times = scanner.nextInt();
        long zeronumber = 0;
        long sum = 0;
        for (int i = 0; i < size; i++) {
            long temp = scanner.nextLong();
            if (temp == 0) {
                zeronumber++;
            } else {
                sum += temp;
            }
        }
        for (int i = 0; i < times; i++) {
            long left = scanner.nextLong();
            long right = scanner.nextLong();
            System.out.println((sum + zeronumber * left) + " " + (sum + zeronumber * right));
        }
    }
}