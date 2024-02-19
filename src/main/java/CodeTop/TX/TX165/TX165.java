package CodeTop.TX.TX165;

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] one = version1.split("\\.");
        String[] two = version2.split("\\.");

        for (int i = 0; i < one.length; i++) {
            if (i >= two.length) {
                for (; i < one.length; i++) {
                    if (getint(one[i]) != 0) {
                        return 1;
                    }
                }
                return 0;
            }
            int oo = getint(one[i]);
            int tt = getint(two[i]);
            if (oo > tt) {
                return 1;
            } else if (oo < tt) {
                return -1;
            }
        }
        if (one.length < two.length) {
            for (int i = two.length - 1; i >= one.length; i--) {
                if (getint(two[i]) != 0) {
                    return -1;
                }
            }
        }
        return 0;
    }

    private int getint(String one) {
        int temp = 0;
        for (int i = 0; i < one.length(); i++) {
            temp = temp * 10 + (one.charAt(i) - '0');
        }
        return temp;
    }
}

public class TX165 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.compareVersion("19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.00.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000",
                "19.8.3.17.5.01.0.0.4.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0000.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.000000"));
        System.out.println(solution.compareVersion("1.0", "1"));
        System.out.println(solution.compareVersion("1.0", "1.0.0"));
        System.out.println(solution.compareVersion("1.0.1", "1"));
        System.out.println(solution.compareVersion("1.01", "1.001"));
        System.out.println(solution.compareVersion("1.0", "1.0.0"));
        System.out.println(solution.compareVersion("0.1", "1.1"));
    }
}
