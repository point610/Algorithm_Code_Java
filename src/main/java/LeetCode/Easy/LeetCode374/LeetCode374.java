package LeetCode.Easy.LeetCode374;

/**
 * @ClassName LeetCode374
 * @Description TODO
 * @Author point
 * @Date 2023/7/14 21:33
 * @Version 1.0
 */

class GuessGame {
    int guess(int num) {
        int res = 1702766719;
        if (num == res) {
            return 0;
        } else if (res < num) {
            return -1;
        } else {
            return 1;
        }
    }
}

class Solution extends GuessGame {
    public int guessNumber(int n) {
        int letf = 1;
        int right = n;
        int mid = letf + (right - letf) / 2;
        while (letf <= right) {
            switch (guess(mid)) {
                case 0: {
                    return mid;
                }
                case 1: {
                    letf = (mid + 1);
                    break;
                }
                case -1: {
                    right = (mid - 1);
                    break;
                }
            }
            mid = letf + (right - letf) / 2;
        }
        return 0;
    }
}

public class LeetCode374 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.guessNumber(2126753390));
    }
}
