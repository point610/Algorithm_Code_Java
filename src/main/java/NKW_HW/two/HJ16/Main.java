package NKW_HW.two.HJ16;


import java.util.*;

public class Main {
    static class Node {
        int price;

        int myd;

        public Node(int price, int myd) {
            this.price = price;
            this.myd = myd;
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
            for (int j = n; j >= nodes.get(0).price; j--) {
                // 计算主的，满意度是指所购买的每件物品的价格与重要度的乘积的总和
                dp[j] = Math.max(dp[j], dp[j - nodes.get(0).price] + nodes.get(0).price * nodes.get(0).myd);

                // 有附属品
                // 使用size进行数量的判断比较好
                // 在nodes的size为1时，若有两个node，无法判断位置1和位置2的
                if (nodes.size() > 1) {
                    if (j >= nodes.get(0).price + nodes.get(1).price) {
                        dp[j] = Math.max(dp[j], dp[j - nodes.get(0).price - nodes.get(1).price]
                                + nodes.get(1).price * nodes.get(1).myd
                                + nodes.get(0).price * nodes.get(0).myd);
                    }

                }
                if (nodes.size() > 2) {
                    // 选主和第二件
                    if (j >= nodes.get(0).price + nodes.get(2).price) {
                        dp[j] = Math.max(dp[j], dp[j - nodes.get(0).price - nodes.get(2).price] + nodes.get(2).price * nodes.get(2).myd + nodes.get(0).price * nodes.get(0).myd);
                    }
                    // 三件都选
                    if (j >= nodes.get(0).price + nodes.get(1).price + nodes.get(2).price) {
                        dp[j] = Math.max(dp[j], dp[j - nodes.get(0).price - nodes.get(1).price - nodes.get(2).price] + nodes.get(2).price * nodes.get(2).myd + nodes.get(1).price * nodes.get(1).myd + nodes.get(0).price * nodes.get(0).myd);
                    }
                }
            }
        }
        System.out.println(dp[n]);
    }

}











