package LQB.lqb3532;

import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    private static class Node {
        int value;
        int cost;

        public Node(int value, int cost) {
            this.value = value;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<Node>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new ArrayList<>());
        }
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            int one = scan.nextInt();
            int two = scan.nextInt();
            list.get(one).add(new Node(one, two));
        }

        for (int i = 0; i < 10; i++) {
            Collections.sort(list.get(i), new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o2.cost - o1.cost;
                }
            });
        }

        int remove = size / 10;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            List<Node> templist = list.get(i);
            if (templist.size() > remove) {
                for (int j = remove; j < templist.size(); j++) {
                    sum += templist.get(j).cost;
                }
            }
        }
        System.out.println(sum);
        scan.close();
    }
}













