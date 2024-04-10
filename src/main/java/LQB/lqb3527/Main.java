package LQB.lqb3527;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 下面举例说明为什么要将nums[]中最小的元素作为因子初始值
        // 3！ 6
        // 4！ 24
        // 5！ 120
        // 和为150 必是 3！的倍数！ 因为 4！5！都是3！的倍数，所以加起来肯定也是 (min) 3！的倍数
        // 所以应该找出数组最小值作为初始的sum，再一个一个往上找
        // 比如上面这个例子，需要有 4个3！才能进化为 4！，由于只有一个 3！所以不能往上找了，break退出，答案就是3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        long min = Long.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextLong();
            min = Math.min(min, nums[i]);
        }
        long sum = min;  // sum为nums[]中的最小值
        long num = 0;    // num为nums[]中值为sum的数量
        while (true) {
            // 如下文注释：num在上个循环中是18，sum 在上个循环中 8更新为9
            // 根据 18 * 8！ = 2 * 9 * 8！ = 2 * 9！可知此次循环的 num 要更新为 18 / 9 = 2
            num = num / sum;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == sum) {
                    num++;
                }
            }
            // 如果sum的数量（num）等于sum+1的倍数，则可以将其逻辑上将这num个sum合成为（sum+1）的阶乘。
            // 形象化： sum = 2  num = 3  3个2 = 2+2+2    sum+1 = 3  3 = 3的倍数， 3个2合成为3的阶乘
            // 18(num)个8！(sum) = 18 * 8！ = 2 * 9 * 8！ = 2 * 9！  sum的数量18 = sum+1=9 的倍数
            if (num % (sum + 1) == 0 && num != 0) {
                sum++;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}













