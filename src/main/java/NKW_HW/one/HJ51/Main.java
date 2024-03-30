package NKW_HW.one.HJ51;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

        int size = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(list.get(size-scanner.nextInt()));

    }
    }
}