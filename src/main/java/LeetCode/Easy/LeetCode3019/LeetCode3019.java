package LeetCode.Easy.LeetCode3019;

class Solution {
    public int countKeyChanges(String s) {
        int times = 0;
        int current = Character.toLowerCase(s.charAt(0));

        for (char cc : s.toLowerCase().toCharArray()) {
            if (current != cc) {
                current = cc;
                times++;
            }
        }
        return times;
    }
}

public class LeetCode3019 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countKeyChanges("aAbBcC"));
        System.out.println(solution.countKeyChanges("AaAaAaaA"));
    }
}
