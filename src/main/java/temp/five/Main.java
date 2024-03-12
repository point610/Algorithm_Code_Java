package temp.five;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static class Node {
        int type;
        int one;
        int two;

        public Node(int type, int one, int two) {
            this.type = type;
            this.one = one;
            this.two = two;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            //第一行输入三个正整数n,m,q，代表总人数，初始的朋友关系数量，发生的事件数量。
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int q = scanner.nextInt();

            UnionFind unionFind = new UnionFind(n + 1);
            List<Node> connect = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int one = scanner.nextInt();
                int two = scanner.nextInt();
                connect.add(new Node(1, one, two));
            }

            Set<String> set = new HashSet<>();
            List<Node> list = new ArrayList<>();
            for (int i = 0; i < q; i++) {
                int type = scanner.nextInt();
                int one = scanner.nextInt();
                int two = scanner.nextInt();
                list.add(new Node(type, one, two));
                if (type == 1) {
                    set.add(one + "-" + two);
                    set.add(two + "-" + one);
                }
            }

            for (Node node : connect) {
                if (!set.contains(node.one + "-" + node.two) && !set.contains(node.two + "-" + node.one)) {
                    unionFind.union(node.one, node.two);
                }
            }

            Collections.reverse(list);

            List<String> ans = new ArrayList<>();
            for (Node node : list) {
                if (node.type == 1) {
                    // 忘记
                    unionFind.union(node.one, node.two);
                } else {
                    if (unionFind.together(node.one, node.two)) {
                        ans.add("Yes");
                    } else {
                        ans.add("No");
                    }
                }
            }

            Collections.reverse(ans);
            for (String an : ans) {
                System.out.println(an);
            }
        }
    }

    static class UnionFind {
        int[] father;
        int[] rank;
        int count;

        boolean together(int one, int two) {
            return find(one) == find(two);
        }

        public UnionFind(int size) {
            count = size;
            father = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                father[i] = i;
                rank[i] = i;
            }
        }

        int find(int one) {
            if (one == father[one]) {
                return one;
            }
            father[one] = find(father[one]);
            return father[one];
        }

        void union(int one, int two) {
            if (one == two) {
                return;
            }
            int oo = find(one);
            int tt = find(two);
            if (oo == tt) {
                return;
            }
            if (rank[oo] > rank[tt]) {
                father[tt] = oo;
            } else if (rank[oo] < rank[tt]) {
                father[oo] = tt;
            } else {
                father[tt] = oo;
                rank[oo]++;
            }
            count--;
        }
    }
}










