package LeetCode.Middle.LeetCode777;


class Solution {
    public boolean canTransform(String start, String end) {
        int oneindex = 0;
        int twoindex = 0;

        int size = start.length();
        while (oneindex < size && twoindex < size) {
            while (oneindex < size && start.charAt(oneindex) == 'X') {
                oneindex++;
            }

            while (twoindex < size && end.charAt(twoindex) == 'X') {
                twoindex++;
            }

            if (oneindex < size && twoindex < size) {
                if (start.charAt(oneindex) != end.charAt(twoindex)) {
                    return false;
                }
                char cc = start.charAt(oneindex);
                if ((cc == 'L' && oneindex < twoindex) || (cc == 'R' && oneindex > twoindex)) {
                    return false;
                }
                oneindex++;
                twoindex++;
            }
        }

        while (oneindex < size) {
            if (start.charAt(oneindex) != 'X') {
                return false;
            }
            oneindex++;
        }
        while (twoindex < size) {
            if (end.charAt(twoindex) != 'X') {
                return false;
            }
            twoindex++;
        }

        return true;
    }
}

public class LeetCode777 {
}
