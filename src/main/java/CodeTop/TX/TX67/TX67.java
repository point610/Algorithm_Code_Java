package CodeTop.TX.TX67;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();

        int oneindex = a.length() - 1;
        int twoindex = b.length() - 1;

        int upper = 0;
        while (0 <= oneindex && 0 <= twoindex) {
            int temp = upper + (a.charAt(oneindex) - '0') + (b.charAt(twoindex) - '0');
            upper = temp / 2;
            stringBuilder.append((char)(temp % 2 + '0'));

            oneindex--;
            twoindex--;
        }
        while (0 <= oneindex) {
            int temp = upper + (a.charAt(oneindex) - '0');
            upper = temp / 2;
            stringBuilder.append((char)(temp % 2 + '0'));

            oneindex--;
        }
        while (0 <= twoindex) {
            int temp = upper + (b.charAt(twoindex) - '0');
            upper = temp / 2;
            stringBuilder.append((char)(temp % 2 + '0'));

            twoindex--;
        }
        if (upper == 1) {
            stringBuilder.append("1");
        }

        return stringBuilder.reverse().toString();
    }
}

public class TX67 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("11", "1"));
        System.out.println(solution.addBinary("1010", "1011"));
    }
}
