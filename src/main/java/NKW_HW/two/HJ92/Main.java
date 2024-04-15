package NKW_HW.two.HJ92;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(ss);
        List<String> list = new ArrayList<>();
        int max = 0;
        while (matcher.find()) {
            String temp = matcher.group();
            max = Math.max(max, temp.length());
            list.add(temp);
        }
        for (String s : list) {
            if (s.length() == max) {
                System.out.print(s);
            }
        }
        System.out.println("," + max);

    }
}












