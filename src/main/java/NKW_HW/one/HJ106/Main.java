package NKW_HW.one.HJ106;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        List<StringBuilder> list = new ArrayList<>();
        int size = strings.length;
        for (int i = size - 1; i >= 0; i--) {
            list.add(new StringBuilder(strings[i]).reverse());
        }
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
    }
}