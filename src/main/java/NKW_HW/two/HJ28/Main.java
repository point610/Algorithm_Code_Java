package NKW_HW.two.HJ28;


import java.math.BigInteger;
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

    private static int max;
    private static boolean[][] dp;

    public static void solution(Scanner scanner) {
        int size = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        max = 0;
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }
        dp = new boolean[size][size];
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (new BigInteger(String.valueOf(list.get(j) + list.get(i))).isProbablePrime(100)) {
                    dp[i][j] = true;
                    dp[j][i] = true;
                }
            }
        }
        dfs(new boolean[size], 0, 0, 0);
        System.out.println(max);
    }

    private static void dfs(boolean[] visit, int tempmax, int times, int index) {
        max = Math.max(max, tempmax);
        if (index >= visit.length) {
            return;
        }
        for (int i = index; i < visit.length - 1; i++) {
            if (!visit[i]) {
                visit[i] = true;
                for (int j = i + 1; j < visit.length; j++) {
                    if (!visit[j] && dp[i][j]) {
                        visit[j] = true;
                        dfs(visit, tempmax + 1, times + 2, i);
                        visit[j] = false;
                    }
                }
                visit[i] = false;
            }
        }
    }


}












