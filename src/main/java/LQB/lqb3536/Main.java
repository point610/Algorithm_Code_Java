package LQB.lqb3536;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    private static class Node {
        long lx;
        long ly;
        long rx;
        long ry;

        Node(long lx, long ly, long rx, long ry) {

            this.lx = lx;
            this.ly = ly;
            this.rx = rx;
            this.ry = ry;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        Node one = new Node(scan.nextLong(), scan.nextLong(), scan.nextLong(), scan.nextLong());
        Node two = new Node(scan.nextLong(), scan.nextLong(), scan.nextLong(), scan.nextLong());

        if (!cover(one, two)) {
            System.out.println(area(one) + area(two));
        } else {
            Node temp = new Node(Math.max(one.lx, two.lx), Math.max(one.ly, two.ly),
                    Math.min(one.rx, two.rx), Math.min(one.ry, two.ry));
            System.out.println(area(one) + area(two) - area(temp));
        }

        scan.close();
    }


    private static boolean cover(Node one, Node two) {
        return !(one.lx >= two.rx || one.rx <= two.lx || one.ly >= two.ry || one.ry <= two.ly);
    }

    private static long area(Node one) {
        return (one.rx - one.lx) * (one.ry - one.ly);
    }
}












