package NKW_HW.HJ16;

import java.util.*;

public class Main {
    static class Node {
        int one;

        int two;

        public Node(int one, int two) {
            this.one = one;
            this.two = two;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<LinkedList<Node>> list = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            list.add(new LinkedList<>());
        }

        // 开始输入数据
        for (int i = 0; i < m; i++) {
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            int index = scanner.nextInt();
            if (index == 0) {
                // 主的加在前面
                list.get(i).addFirst(new Node(one, two));
            } else {
                // 附属品加在后面
                list.get(index - 1).addLast(new Node(one, two));
            }
        }
        list.removeIf(AbstractCollection::isEmpty);
        int[] dp = new int[n + 1];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LinkedList<Node> nodes = list.get(i);
            // 从n到当前链表的主
            for (int j = n; j >= nodes.get(0).one; j--) {
                // 计算主的
                dp[j] = Math.max(dp[j], dp[j - nodes.get(0).one] + nodes.get(0).one * nodes.get(0).two);

                // 有附属品
                // 使用size进行数量的判断比较好
                // 在nodes的size为1时，若有两个node，无法判断位置1和位置2的
                if (nodes.size() > 1) {
                    if (j >= nodes.get(0).one + nodes.get(1).one) {
                        dp[j] = Math.max(dp[j], dp[j - nodes.get(0).one - nodes.get(1).one] + nodes.get(1).one * nodes.get(1).two + nodes.get(0).one * nodes.get(0).two);
                    }

                }
                if (nodes.size() > 2) {
                    if (j >= nodes.get(0).one + nodes.get(2).one) {
                        dp[j] = Math.max(dp[j], dp[j - nodes.get(0).one - nodes.get(2).one] + nodes.get(2).one * nodes.get(2).two + nodes.get(0).one * nodes.get(0).two);
                    }
                    if (j >= nodes.get(0).one + nodes.get(1).one + nodes.get(2).one) {
                        dp[j] = Math.max(dp[j], dp[j - nodes.get(0).one - nodes.get(1).one - nodes.get(2).one]
                                + nodes.get(2).one * nodes.get(2).two + nodes.get(1).one * nodes.get(1).two + nodes.get(0).one * nodes.get(0).two);
                    }
                }
            }
        }
        System.out.println(dp[n]);
    }

}
