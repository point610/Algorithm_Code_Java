package NKW_HW.HJ72;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static class Node {
        int da;

        int zhong;

        int xiao;

        public Node(int da, int zhong, int xiao) {
            this.da = da;
            this.zhong = zhong;
            this.xiao = xiao;
        }

        @Override
        public String toString() {
            return da + " " + zhong + " " + xiao;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp = scanner.nextInt();
        List<Node> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j < 34; j++) {
                for (int k = 0; k < 101; k += 3) {
                    if (i + j + k == 100) {
                        int money = i * 5 + j * 3 + k / 3;
                        if (money == 100) {
                            list.add(new Node(i, j, k));
                        }
                    }
                }
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }
}