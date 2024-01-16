package NKW_HW.HJ80;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int one = scanner.nextInt();
        for (int i = 0; i < one; i++) {
            set.add(scanner.nextInt());
        }
        int two = scanner.nextInt();
        for (int i = 0; i < two; i++) {
            set.add(scanner.nextInt());
        }
        List<Integer> list = new ArrayList<>();
        set.forEach(integer -> {
            list.add(integer);
        });
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}