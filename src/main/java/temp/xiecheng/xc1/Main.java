package temp.xiecheng.xc1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    private static List<List<Integer>> list;
    private static int[] number;
    private static boolean[] prime;

    public static void main(String[] args) {
        list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (scanner.hasNextInt()) { // 注意 while 处理多个 case
            int size = scanner.nextInt();
            number = new int[size];
            prime = new boolean[size + size + 1];
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                temp.add(i + 1);
            }
            getlist(0, temp);
            getprime(size + size);
            //System.out.println(list);
            System.out.println(getcount());
        }
    }

    private static int getcount() {
        int count = 0;
        for (List<Integer> integers : list) {
            if (can(integers)) {
                count++;
            }
        }
        return count;
    }

    private static boolean can(List<Integer> integers) {
        int size = integers.size();
        for (int i = 0; i < size - 1; i++) {
            if (prime[integers.get(i) + integers.get(i + 1)]) {
                return false;
            }
        }
        return true;
    }

    private static void getprime(int size) {
        for (int i = 2; i <= size; i++) {
            if (isprime(i)) {
                prime[i] = true;
            }
        }
    }

    private static boolean isprime(int one) {
        return new BigInteger(String.valueOf(one)).isProbablePrime(100);
    }

    public static void getlist(int index, List<Integer> temp) {
        if (index == number.length) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < number.length; i++) {
            int ttt = temp.get(i);
            temp.set(i, temp.get(index));
            temp.set(index, ttt);

            getlist(index + 1, temp);

            ttt = temp.get(i);
            temp.set(i, temp.get(index));
            temp.set(index, ttt);

        }

    }
}