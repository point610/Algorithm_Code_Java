package NKW_HW.two.HJ4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            solution(scanner);
        }
    }

    public static void solution(Scanner scanner) {
        String ss = scanner.nextLine();
        List<String> list = new ArrayList<>();
        int index = 0;
        while (index + 8 < ss.length()) {
            list.add(ss.substring(index, index + 8));
            index += 8;
        }
        if (index!= ss.length()) {
            StringBuilder temp = new StringBuilder(ss.substring(index));
            while (temp.length() != 8) {
                temp.append("0");
            }
            list.add(String.valueOf(temp));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}





































