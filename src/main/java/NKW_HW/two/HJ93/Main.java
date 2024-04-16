package NKW_HW.two.HJ93;

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
        int five = 0;
        int three = 0;
        List<Integer> list = new ArrayList<>();
        int size = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int temp = scanner.nextInt();
            if (temp % 5 == 0) {
                five += temp;
            } else if (temp % 3 == 0) {
                three += temp;
            } else {
                list.add(temp);
            }
            sum += temp;
        }

        if (sum % 2 == 1 || sum % 2 == -1) {
            System.out.println(false);
            return;
        }

        int target = sum / 2 - Math.max(five, three);

        if (target == 0) {
            System.out.println(true);
            return;
        }
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (Integer ii : list) {
            if (set.contains(target - ii)) {
                System.out.println(true);
                return;
            }
            Set<Integer> temp = new HashSet<>();
            for (Integer iii : set) {
                temp.add(iii + ii);
            }
            set.addAll(temp);
        }
        System.out.println(false);
    }
}













