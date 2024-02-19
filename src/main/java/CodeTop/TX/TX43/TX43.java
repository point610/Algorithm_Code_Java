package CodeTop.TX.TX43;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String multiply(String num1, String num2) {
        Queue<String> list = new LinkedList<>();
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2.equals("0")) {
            return "0";
        }

        for (int i = num2.length() - 1, j = 0; i >= 0; j++, i--) {
            list.add(getmult(num1, num2.charAt(i) - '0', j));
        }

        return getsum(list);
    }

    public String getsum(Queue<String> queue) {

        while (queue.size() > 1) {
            String temp = sum(queue.poll(), queue.poll());
            queue.add(temp);
        }

        return new StringBuilder(queue.peek()).reverse().toString();
    }

    public String sum(String one, String two) {
        StringBuilder stringBuilder = new StringBuilder();
        int upper = 0;
        int oneindex = 0;
        int twoindex = 0;
        while (oneindex < one.length() && twoindex < two.length()) {
            int sum = upper + (one.charAt(oneindex) - '0') + (two.charAt(twoindex) - '0');

            upper = sum / 10;

            stringBuilder.append(sum % 10);

            oneindex++;
            twoindex++;
        }
        while (oneindex < one.length()) {
            int sum = upper + (one.charAt(oneindex) - '0');

            upper = sum / 10;

            stringBuilder.append(sum % 10);

            oneindex++;
        }
        while (twoindex < two.length()) {
            int sum = upper + (two.charAt(twoindex) - '0');

            upper = sum / 10;

            stringBuilder.append(sum % 10);

            twoindex++;
        }

        if (upper != 0) {
            stringBuilder.append(upper);
        }

        return stringBuilder.toString();
    }


    public String getmult(String one, int two, int zero) {
        StringBuilder stringBuilder = new StringBuilder();
        int upper = 0;
        int size = one.length();
        for (int i = size - 1; i >= 0; i--) {
            int oo = one.charAt(i) - '0';
            int temp = upper + oo * two;

            upper = temp / 10;
            stringBuilder.append(temp % 10);
        }

        if (upper != 0) {
            stringBuilder.append(upper);
        }

        for (int i = 0; i < zero; i++) {
            stringBuilder.insert(0, '0');
        }

        return stringBuilder.toString();
    }
}

public class TX43 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("123456789", "987654321"));
        System.out.println(solution.multiply("2", "3"));
        System.out.println(solution.multiply("123", "456"));
    }
}
