package LQB.lqb17152;

import java.util.Scanner;
import java.util.Stack;

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
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] left = new int[size];
        int[] right = new int[size];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                left[i] = 0;
            } else {
                left[i] = stack.peek() + 1;
            }

            stack.push(i);
        }

        stack.clear();

        for (int i = size - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                right[i] = size - 1;
            } else {
                right[i] = stack.peek() - 1;
            }

            stack.push(i);
        }

        long ans = 0;
        long max = 0;
        for (int i = 0; i < size; i++) {
            ans = (long) (right[i] - left[i] + 1) * arr[i];
            max = Math.max(max, ans);
        }
        System.out.println(max);


    }
}












