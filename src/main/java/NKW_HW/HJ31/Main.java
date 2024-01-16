package NKW_HW.HJ31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[a-zA-z]+");
        String ss = scanner.nextLine();
        Matcher matcher = pattern.matcher(ss);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            String group = matcher.group();
            list.add(group);
        }
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
    }
}