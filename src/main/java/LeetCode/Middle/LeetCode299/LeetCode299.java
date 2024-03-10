package LeetCode.Middle.LeetCode299;

class Solution {
    public String getHint(String secret, String guess) {
        int samecount = 0;
        int change = 0;

        int[] one = new int[10];
        int[] two = new int[10];

        int size = secret.length();
        for (int i = 0; i < size; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                samecount++;
            } else {
                one[secret.charAt(i) - '0']++;
                two[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            change += Math.min(one[i], two[i]);
        }
        return samecount + "A" + change + "B";
    }
}

public class LeetCode299 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getHint("1807", "7810"));
        System.out.println(solution.getHint("1123", "0111"));
    }
}
