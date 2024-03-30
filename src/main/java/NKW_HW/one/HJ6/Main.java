package NKW_HW.one.HJ6;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            return;
        }
        List<Integer> list = new ArrayList<>();

        while (n >= 2) {
            if (isprime(n)) {
                list.add(n);
                break;
            }
            int index = 2;
            while (true) {
                if (isprime(index)) {
                    if (n % index == 0) {
                        list.add(index);
                        n /= index;
                        break;
                    }
                }
                index++;
            }
        }
        Collections.sort(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i));
            System.out.print(" ");
        }
    }


    private static boolean isprime(int one) {
        return new BigInteger(String.valueOf(one)).isProbablePrime(100);
    }
}