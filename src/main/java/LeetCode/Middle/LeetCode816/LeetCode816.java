package LeetCode.Middle.LeetCode816;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<String> getstring(String one) {
        List<String> list = new ArrayList<>();
        if (one.length() == 1) {
            list.add(one);
            return list;
        }

        if (one.charAt(0) == '0') {
            // 加小数点的
            if (one.charAt(one.length() - 1) != '0') {
                list.add(one.charAt(0) + "." + one.substring(1));
            }
        } else if (one.charAt(one.length() - 1) == '0') {
            list.add(one);
        } else {
            list.add(one);
            for (int i = 1; i < one.length(); i++) {
                String left = one.substring(0, i);
                String right = one.substring(i);

                list.add(left + "." + right);
            }
        }
        return list;
    }

    public List<String> ambiguousCoordinates(String s) {
        List<String> list = new ArrayList<>();
        s = s.substring(1, s.length() - 1);
        int size = s.length();
        for (int i = 1; i < size; i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);

            if (!check(left) || !check(right)) {
                continue;
            }
            List<String> ll = getstring(left);
            List<String> rr = getstring(right);

            for (String l : ll) {
                for (String r : rr) {
                    list.add("(" + l + ", " + r + ")");
                }
            }

        }
        return list;
    }

    private boolean check(String one) {
        int temp = Integer.parseInt(one);
        if (temp > 0) {
            return true;
        } else {
            return one.length() <= 1;
        }
    }
}

public class LeetCode816 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.ambiguousCoordinates("(0010)"));
        System.out.println(solution.ambiguousCoordinates("(00011)"));
        System.out.println(solution.ambiguousCoordinates("(123)"));
        System.out.println(solution.ambiguousCoordinates("(0123)"));
        System.out.println(solution.ambiguousCoordinates("(100)"));
    }
}
