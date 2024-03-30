package NKW_HW.two.HJ60;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        List<Integer> list = getlist();
        int target = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int one = 0;
        int two = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    if (list.get(j) - list.get(i) < min) {
                        one = list.get(i);
                        two = list.get(j);
                        min = Math.min(min, list.get(j) - list.get(i));
                    }
                }
            }
        }
        System.out.println(one);
        System.out.println(two);

    }

    public static List<Integer> getlist() {

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            if (new BigInteger(String.valueOf(i)).isProbablePrime(100)) {
                list.add(i);
            }
        }
        return list;
    }
}












