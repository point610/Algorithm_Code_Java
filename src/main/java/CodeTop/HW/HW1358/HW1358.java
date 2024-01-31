package CodeTop.HW.HW1358;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private boolean can(boolean a, boolean b, boolean c) {
        return a && b && c;
    }

    public int numberOfSubstrings(String s) {
        int sum = 0;
        int size = s.length();
        List<Integer> aa = new ArrayList<>();
        List<Integer> bb = new ArrayList<>();
        List<Integer> cc = new ArrayList<>();
        int aindex = 0;
        int bindex = 0;
        int cindex = 0;

        for (int i = 0; i < size; i++) {
            char temp = s.charAt(i);
            switch (temp) {
                case 'a': {
                    aa.add(i);
                    break;
                }
                case 'b': {
                    bb.add(i);
                    break;
                }
                case 'c': {
                    cc.add(i);
                    break;
                }
            }
        }
        if (aa.isEmpty() || bb.isEmpty() || cc.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < size; i++) {
            while (aa.get(aindex) < i) {
                aindex++;
                if (aindex >= aa.size()) {
                    break;
                }
            }
            while (bb.get(bindex) < i) {
                bindex++;
                if (bindex >= bb.size()) {
                    break;
                }
            }
            while (cc.get(cindex) < i) {
                cindex++;
                if (cindex >= cc.size()) {
                    break;
                }
            }
            if (aindex >= aa.size() || bindex >= bb.size() || cindex >= cc.size()) {
                break;
            }
            int max = Math.max(cc.get(cindex), Math.max(aa.get(aindex), bb.get(bindex)));
            sum += (size - max);
        }


        return sum;
    }
}

public class HW1358 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfSubstrings("ababbbc"));
        System.out.println(solution.numberOfSubstrings("abcabc"));
        System.out.println(solution.numberOfSubstrings("aaacb"));
        System.out.println(solution.numberOfSubstrings("abc"));
    }
}
