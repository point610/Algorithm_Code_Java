package NKW_HW.two.HJ94;

import java.util.*;

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
        int size = scanner.nextInt();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        scanner.nextLine();
        String[] split = scanner.nextLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            map.put(split[i], 0);
        }
        int other = 0;
        size = scanner.nextInt();
        scanner.nextLine();
        split = scanner.nextLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(split[i])) {
                map.put(split[i], map.get(split[i]) + 1);
            } else {
                other++;
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));

        }
        System.out.println("Invalid : " + other);
    }
}












