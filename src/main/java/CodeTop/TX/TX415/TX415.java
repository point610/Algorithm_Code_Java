package CodeTop.TX.TX415;

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int oneindex = num1.length() - 1;
        int twoindex = num2.length() - 1;

        int upper = 0;
        while (oneindex >= 0 && twoindex >= 0) {
            int one = num1.charAt(oneindex) - '0';
            int two = num2.charAt(twoindex) - '0';

            int sum = upper + one + two;
            upper = sum / 10;
            int current = sum % 10;
            stringBuilder.append(current);

            oneindex--;
            twoindex--;
        }

        while (oneindex >= 0) {
            int one = num1.charAt(oneindex) - '0';

            int sum = upper + one;
            upper = sum / 10;
            int current = sum % 10;
            stringBuilder.append(current);

            oneindex--;
        }

        while (twoindex >= 0) {
            int two = num2.charAt(twoindex) - '0';

            int sum = upper + two;
            upper = sum / 10;
            int current = sum % 10;
            stringBuilder.append(current);

            twoindex--;
        }
        if (upper != 0) {
            stringBuilder.append(upper);
        }

        return stringBuilder.reverse().toString();
    }
}

public class TX415 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addStrings("11", "123"));
        System.out.println(solution.addStrings("456", "77"));
        System.out.println(solution.addStrings("0", "0"));
        System.out.println(solution.addStrings("1", "9"));
    }
}


