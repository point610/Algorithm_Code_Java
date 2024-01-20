package LeetCode.Easy.LeetCode2917;

class Solution {
    private int[] ll;

    public int findKOr(int[] nums, int k) {
        ll = new int[64];
        for (int num : nums) {
            add(num);
        }

        return get(k);
    }

    private void add(int one) {
        StringBuilder stringBuilder = new StringBuilder(Integer.toBinaryString(one)).reverse();
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '1') {
                ll[i]++;
            }
        }
    }

    private int get(int k) {
        int ii = 0;
        for (int i = 0; i < 64; i++) {
            if (ll[i] >= k) {
                ii += (int) Math.pow(2, i);
            }
        }
        return ii;
    }
}

public class LeetCode2917 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findKOr(new int[]{7, 12, 9, 8, 9, 15}, 4));
        System.out.println(solution.findKOr(new int[]{2, 12, 1, 11, 4, 5}, 6));
        System.out.println(solution.findKOr(new int[]{10, 8, 5, 9, 11, 6, 8}, 1));
    }
}
