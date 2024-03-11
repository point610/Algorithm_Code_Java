package temp.xiecheng.xc3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int row;
    static int col;
    static char[][] list;
    static List<Node> yyy;
    static List<Node> ooo;
    static List<Node> uuu;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            yyy = new ArrayList<>();
            uuu = new ArrayList<>();
            ooo = new ArrayList<>();
            row = scanner.nextInt();
            col = scanner.nextInt();
            scanner.nextLine();
            list = new char[row][];
            for (int i = 0; i < row; i++) {
                list[i] = scanner.nextLine().toCharArray();
            }
            initial();
            System.out.println(getcount());
        }

    }

    private static int getcount() {
        int count = 0;

        for (Node y : yyy) {
            for (Node o : ooo) {
                for (Node u : uuu) {
                    if (is(y, o, u)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static boolean is(Node one, Node two, Node three) {
        List<Integer> temp = new ArrayList<>();
        temp.add(powder(one.x - two.x) + powder(one.y - two.y));
        temp.add(powder(three.x - two.x) + powder(three.y - two.y));
        temp.add(powder(one.x - three.x) + powder(one.y - three.y));
        Collections.sort(temp);
        if (temp.get(0) + temp.get(1) != temp.get(2)) {
            return false;
        }
        return ispoint(one, two, three) || ispoint(three, two, one) || ispoint(two, three, one);
    }

    static boolean ispoint(Node one, Node two, Node three) {
        return (one.x == two.x && one.y == three.y) || (one.x == three.x && one.y == two.y);
    }

    static int powder(int one) {
        return one * one;
    }

    static void initial() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                switch (list[i][j]) {
                    case 'y': {
                        yyy.add(new Node(i, j));
                        break;
                    }
                    case 'o': {
                        ooo.add(new Node(i, j));
                        break;
                    }
                    case 'u': {
                        uuu.add(new Node(i, j));
                        break;
                    }
                }
            }
        }
    }


}













