package interview.mt240316.mt5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        int left;
        int right;
        int value;

        public Node(int left, int right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNext()) { // 注意 while 处理多个 case

            int size = scanner.nextInt();
            int[] list = new int[size];
            for (int i = 0; i < size; i++) {
                list[i] = scanner.nextInt();
            }

            long sum = 0;
            List<Node> nodes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int left = 0;
                int right = 0;
                for (int j = 0; j < size; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (j < i) {
                        if (list[j] < list[i]) {
                        } else {
                            left++;
                        }
                    } else {
                        // right
                        if (list[i] > list[j]) {
                            right++;
                        }
                    }
                }
                nodes.add(new Node(left, right, list[i]));
            }

            for (int i = 0; i < size; i++) {
                System.out.print(get(nodes, i));
                System.out.print(' ');
            }
        }
    }

    private static int get(List<Node> nodes, int index) {
        int sum = index;
        for (int i = index + 1; i < nodes.size(); i++) {
            if (nodes.get(i).value > nodes.get(index).value) {
                sum += (nodes.get(i).left);
            } else {
                sum += (nodes.get(i).left) - 1;
            }
        }

        return sum;
    }
}















