package LQB.lqb3527;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.SocketHandler;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            int temp = scan.nextInt();
            map.merge(temp, 1, Integer::sum);
        }

        while (true) {
            int key = map.firstKey();
            int value = map.get(key);
            if (value % (key + 1) == 0) {
                map.remove(key);
                map.merge(key + 1, value / (key + 1), Integer::sum);
            } else {
                System.out.println(key);
                break;
            }
        }

        scan.close();
    }

}