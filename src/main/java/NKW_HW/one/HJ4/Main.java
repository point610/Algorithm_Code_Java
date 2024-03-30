package NKW_HW.one.HJ4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("")) {
            System.out.println(s);
            return;
        }
        int index = 0;
        List<String> list = new ArrayList<>();

        while (index < s.length()) {
            int nextindex = index + 8;
            if (nextindex > s.length()) {
                StringBuilder temp = new StringBuilder(s.substring(index));
                while (temp.length() != 8) {
                    temp.append('0');
                }
                list.add(String.valueOf(temp));
                break;
            }
            list.add(s.substring(index, nextindex));
            index = nextindex;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }


    }
}