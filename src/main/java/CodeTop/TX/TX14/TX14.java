package CodeTop.TX.TX14;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (true) {
            if (strs[0].length() <= index) {
                break;
            }
            char cc = strs[0].charAt(index);
            boolean same = true;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() <= index) {
                    same = false;
                    break;
                }
                if (strs[i].charAt(index) != cc) {
                    same = false;
                    break;
                }
            }
            if (same) {
                stringBuilder.append(cc);
            } else {
                break;
            }
            index++;
        }

        return stringBuilder.toString();
    }
}

public class TX14 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(solution.longestCommonPrefix(new String[]{"cir", "car"}));
    }
}
