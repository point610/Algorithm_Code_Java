package NKW_HW.one.HJ3;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int size = scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < size; i++) {
                set.add(scanner.nextInt());
            }
            List<Integer> list = new ArrayList<>();
            for (Integer ii : set) {
                list.add(ii);
            }
            Collections.sort(list);
            for (Integer ii : list) {
                System.out.println(ii);
            }
        }
    }
}