package LeetCode.Easy.LeetCode2437;

/**
 * @ClassName LeetCode2437
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:24
 * @Version 1.0
 */
class Solution {
    public int countTime(String time) {

        int hourtimes = 1;
        if (time.charAt(0) == '?' && time.charAt(1) == '?') {
            hourtimes = 24;
        }
        if (time.charAt(0) == '?' && time.charAt(1) != '?') {
            if ('4' <= time.charAt(1)) {
                hourtimes = 2;
            } else {
                hourtimes = 3;
            }
        }
        if (time.charAt(0) != '?' && time.charAt(1) == '?') {
            if ('2' == time.charAt(0)) {
                hourtimes = 4;
            } else {
                hourtimes = 10;
            }
        }
        // min
        int mintimes = 1;
        if (time.charAt(3) == '?') {
            mintimes = 6;
        }
        if (time.charAt(4) == '?') {
            mintimes *= 10;
        }
return hourtimes*mintimes;

    }
}

public class LeetCode2437 {
}
