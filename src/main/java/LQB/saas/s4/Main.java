package LQB.saas.s4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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

    private static int res;

    private static void dfs(int size, int k, int sum, int startindex, List<Integer> list) {
        if (size == k) {
            if (isprime(sum)) {
                res++;
            }
            return;
        }
        for (int i = startindex; i < list.size(); i++) {
            dfs(size + 1, k, sum + list.get(i), i + 1, list);
        }

    }

    private static boolean isprime(int one) {
        return new BigInteger(String.valueOf(one)).isProbablePrime(100);
    }

    public static void solution(Scanner scanner) {
        int size = scanner.nextInt();
        res = 0;
        int k = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int temp = scanner.nextInt();
            list.add(temp);
        }
        dfs(0, k, 0, 0, list);

        System.out.println(res);
    }
}












