package LeetCode.Easy.LeetCode3114;

class Solution {
    public String findLatestTime(String s) {

        String[] split = s.split(":");
        String hh = split[0];
        String mm = split[1];
        if (hh.contains("?")) {
            hh = getmaxhh(hh);
        }
        if (mm.contains("?")) {
            mm = getmaxmm(mm);
        }
        return hh + ":" + mm;
    }

    private String getmaxhh(String hh) {
        if (hh.charAt(0) == '?' && hh.charAt(1) == '?') {
            return "11";
        }
        if (hh.charAt(0) == '?') {
            if (hh.charAt(1) <= '1') {
                return "1" + hh.charAt(1);
            } else {
                return "0" + hh.charAt(1);
            }
        }
        if (hh.charAt(1) == '?') {
            if (hh.charAt(0) == '1') {
                return "11";
            } else {
                return "09";
            }
        }
        return "";
    }

    private String getmaxmm(String mm) {
        if (mm.charAt(0) == '?' && mm.charAt(1) == '?') {
            return "59";
        }
        if (mm.charAt(0) == '?') {
            return "5" + mm.charAt(1);
        }
        if (mm.charAt(1) == '?') {
            return mm.charAt(0) + "9";
        }
        return "";
    }
}

public class LeetCode3114 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findLatestTime("1?:?4"));
        System.out.println(solution.findLatestTime("0?:5?"));
    }
}





















