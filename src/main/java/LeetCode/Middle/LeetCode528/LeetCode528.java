package LeetCode.Middle.LeetCode528;

import java.util.Random;
import java.util.TreeMap;

class Solution {
    private TreeMap<Integer, Integer> map;
    private Random random;
    private int sum;

    public Solution(int[] w) {
        random = new Random();
        map = new TreeMap<>();
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            map.put(sum, i);
        }
        this.sum = sum;
    }

    public int pickIndex() {
        return map.get(map.ceilingKey(random.nextInt(sum)));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
public class LeetCode528 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(3, 0);
        map.put(6, 1);
        System.out.println(map.get(map.ceilingKey(4)));
    }
}
























