package NKW_HW.HJ73;

import java.time.LocalDate;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yy = scanner.nextInt();
        int mm = scanner.nextInt();
        int dd = scanner.nextInt();
        LocalDate date = LocalDate.of(yy, mm, dd);
        System.out.println(date.getDayOfYear());

    }
}