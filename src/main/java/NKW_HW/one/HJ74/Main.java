package NKW_HW.one.HJ74;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        List<String> list = new ArrayList<>();
        int size = one.length();
        int times = 0;
        int lastindex = 0;
        for (int i = 0; i < size; i++) {
            if (one.charAt(i) == '"') {
                if (times == 1) {
                    times--;
                    String temp = one.substring(lastindex, i);
                    list.add(temp);
                    lastindex = i + 1;
                } else {
                    String before = one.substring(lastindex, i);
                    String[] splits = before.split(" ");
                    for (String ss : splits) {
                        if (!ss.isEmpty()) {
                            list.add(ss);
                        }
                    }
                    lastindex = i + 1;
                    times++;
                }
            }

        }
        if (lastindex != size - 1) {
            String before = one.substring(lastindex, size);
            String[] splits = before.split(" ");
            for (String ss : splits) {
                if (!ss.isEmpty()) {
                    list.add(ss);
                }
            }
        }
        System.out.println(list.size());
        for (String ss : list) {
            System.out.println(ss);
        }

    }
}