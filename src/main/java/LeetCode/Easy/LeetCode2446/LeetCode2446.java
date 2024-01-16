package LeetCode.Easy.LeetCode2446;

/**
 * @ClassName LeetCode2446
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:34
 * @Version 1.0
 */
class Solution {
    int getS(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        int min = Integer.parseInt(s.substring(3));
        return hour * 60 + min;
    }

    public boolean haveConflict(String[] event1, String[] event2) {

        int one1 = getS(event1[0]);
        int one2 = getS(event1[1]);

        int two1 = getS(event2[0]);
        int two2 = getS(event2[1]);
        if (one2 < two1 || one1 > two2) {
            return false;
        }
        return true;
    }
}

public class LeetCode2446 {
}
