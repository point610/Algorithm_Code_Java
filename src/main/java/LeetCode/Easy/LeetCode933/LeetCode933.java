package LeetCode.Easy.LeetCode933;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName LeetCode933
 * @Description TODO
 * @Author point
 * @Date 2023/8/13 23:59
 * @Version 1.0
 */
class RecentCounter {
    Set<Integer> set = new HashSet<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        int min = t - 3000;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next < min) {
                iterator.remove();
            }
        }
        set.add(t);
        return set.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
public class LeetCode933 {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
    }
}
