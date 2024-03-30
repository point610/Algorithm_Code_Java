package NKW_HW.one.HJ92;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String one = scanner.nextLine();
            get(one);
        }
    }

    private static void get(String one) {

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(one);
        List<String> list = new ArrayList<>();
        int max = 0;

        while (matcher.find()) {
            String temp = matcher.group();
            list.add(temp);
            if (temp.length() > max) {
                max = temp.length();
            }
        }
        for (String ss : list) {
            if (ss.length() == max) {
                System.out.print(ss);
            }
        }
        System.out.print(',');
        System.out.println(max);

    }

}