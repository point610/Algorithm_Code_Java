package NKW_HW.one.HJ25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static class Node {
        int index;

        String value;

        public Node(int index, String value) {
            this.index = index;
            this.value = value;
        }

    }

    private static class ALLNode {
        int value;

        int number;

        List<Node> nodes;

        public ALLNode(int value, int number, List<Node> nodes) {
            this.value = value;
            this.number = number;
            this.nodes = nodes;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(value);
            stringBuilder.append(' ');
            stringBuilder.append(number);
            stringBuilder.append(' ');
            for (Node nn : nodes) {
                stringBuilder.append(nn.index);
                stringBuilder.append(' ');
                stringBuilder.append(nn.value);
                stringBuilder.append(' ');
            }
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int size = scanner.nextInt();
            List<String> stringList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                stringList.add(String.valueOf(scanner.nextInt()));
            }
            size = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int temp = scanner.nextInt();
                if (!list.contains(temp)) {
                    list.add(temp);
                }
            }
            Collections.sort(list);

            List<ALLNode> allNodes = new ArrayList<>();
            size = stringList.size();
            for (Integer ii : list) {

                List<Node> temp = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    if (stringList.get(i).contains(String.valueOf(ii))) {
                        temp.add(new Node(i, stringList.get(i)));
                    }
                }
                if (temp.size() > 0) {
                    allNodes.add(new ALLNode(ii, temp.size(), temp));
                }
            }
            int sum = 0;
            for (ALLNode nn : allNodes) {
                sum += 2;
                sum += nn.nodes.size() * 2;
            }
            System.out.print(sum);
            System.out.print(' ');
            for (ALLNode nn : allNodes) {
                System.out.print(nn);
            }
        }
    }
}