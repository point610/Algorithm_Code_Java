package temp.tx.tx1;

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
        int pointnumber = scanner.nextInt();
        int edgenumber = scanner.nextInt();

        List<Set<Character>> list = new ArrayList<>();
        for (int i = 0; i <= pointnumber; i++) {
            list.add(new HashSet<>());
        }
        scanner.nextLine();
        for (int i = 0; i < edgenumber; i++) {
            String[] split = scanner.nextLine().split(" ");
            int one = Integer.valueOf(split[0]);
            int two = Integer.valueOf(split[1]);
            char cc = split[2].charAt(0);
            list.get(one).add(cc);
            list.get(two).add(cc);
        }
        int sum = 0;
        for (int i = 1; i <= pointnumber; i++) {
            if (list.get(i).isEmpty() || (list.get(i).size() == 1 && list.get(i).contains('R'))) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}












