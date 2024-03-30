package NKW_HW.one.HJ13;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.asList(scanner.nextLine().split(" "));

        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            System.out.print(' ');}


    }
}