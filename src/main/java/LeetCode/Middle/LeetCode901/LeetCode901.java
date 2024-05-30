package LeetCode.Middle.LeetCode901;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class StockSpanner {
    Deque<int[]> d = new ArrayDeque<>();

    public int next(int price) {
        int len = 1;

        while (!d.isEmpty() && d.getLast()[0] <= price) {
            len += d.pollLast()[1];
        }

        d.addLast(new int[]{price, len});

        return len;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
public class LeetCode901 {
    public static void main(String[] args) {
        StockSpanner s = new StockSpanner();

        System.out.println(s.next(100)); // 1

        System.out.println(s.next(80)); // 1

        System.out.println(s.next(60)); // 1

        System.out.println(s.next(70)); // 2

        System.out.println(s.next(60)); // 1

        System.out.println(s.next(75)); // 4

        System.out.println(s.next(85)); // 6


    }
}
