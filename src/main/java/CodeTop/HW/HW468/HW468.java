package CodeTop.HW.HW468;

class Solution {
    public String validIPAddress(String queryIP) {


        String[] one = queryIP.split("\\.");
        String[] two = queryIP.split(":");
        if (one.length == 4) {
            int count = 0;
            for (char cc : queryIP.toCharArray()) {
                if (cc == '.') {
                    count++;
                }
            }
            if (count == 3 && check4(one)) {
                return "IPv4";
            }
        } else if (two.length == 8) {
            int count = 0;
            for (char cc : queryIP.toCharArray()) {
                if (cc == ':') {
                    count++;
                }
            }

            if (count == 7 && check6(two)) {
                return "IPv6";
            }
        }
        return "Neither";
    }

    private int get4(String one) {
        Integer iii;
        try {
            iii = Integer.valueOf(one);
        } catch (Exception e) {
            return -1;
        }
        if (one.equals(iii.toString()) && 0 <= iii && iii <= 255) {
            return iii;
        }
        return -1;
    }

    private boolean get6(String one) {
        if (one.length() > 4 || one.length() <= 0) {
            return false;
        }
        for (char cc : one.toCharArray()) {
            if (Character.isDigit(cc)) {
                continue;
            }

            if (Character.isLowerCase(cc)) {
                if ('a' > cc || cc > 'f') {
                    return false;
                }
            }
            if (Character.isUpperCase(cc)) {
                if ('A' > cc || cc > 'F') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean check4(String[] split) {
        for (String s : split) {
            if (get4(s) == -1) {
                return false;
            }
        }
        return true;
    }

    private boolean check6(String[] split) {
        for (String s : split) {
            if (!get6(s)) {
                return false;
            }
        }
        return true;
    }
}

public class HW468 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validIPAddress("1e1.4.5.6"));
        System.out.println(solution.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
        System.out.println(solution.validIPAddress("172.16.254.1"));
        System.out.println(solution.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        System.out.println(solution.validIPAddress("256.256.256.256"));


    }
}
