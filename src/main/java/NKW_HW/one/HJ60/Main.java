package NKW_HW.one.HJ60;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int index = 2;
        List<Integer> list = new ArrayList<>();
        while (true) {
            if (isprime(index)) {
                list.add(index);
            }
            if (index > number) {
                break;
            }
            index++;
        }
        int size = list.size();
        int mintep = Integer.MAX_VALUE;
        int one = 0;
        int two = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (Math.abs(number - list.get(i) - list.get(j)) < mintep) {
                    mintep = Math.abs(number - list.get(i) - list.get(j));
                    two = list.get(j);
                    one = list.get(i);
                } else if (Math.abs(number - list.get(i) - list.get(j)) == mintep) {
                    mintep = Math.abs(number - list.get(i) - list.get(j));
                    if (Math.abs(one - two) > Math.abs(list.get(i) - list.get(j))) {
                        two = list.get(j);
                        one = list.get(i);
                    }
                }
            }
        }
        if (one > two) {
            System.out.println(two);
            System.out.println(one);
        } else {
            System.out.println(one);
            System.out.println(two);

        }

    }

    private static boolean isprime(int one) {
        return new BigInteger(String.valueOf(one)).isProbablePrime(100);
    }
}