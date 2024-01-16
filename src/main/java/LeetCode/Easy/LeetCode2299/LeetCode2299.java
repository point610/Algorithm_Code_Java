package LeetCode.Easy.LeetCode2299;

/**
 * @ClassName LeetCode2299
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 22:23
 * @Version 1.0
 */
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int size = password.length();
        if (size < 8) {
            return false;
        }

        boolean xiao = false;
        boolean da = false;
        boolean shuzi = false;
        boolean teshu = false;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                if (password.charAt(i - 1) == password.charAt(i)) {
                    return false;
                }
            }
            if (!teshu && "!@#$%^&*()-+".indexOf(password.charAt(i)) != -1) {
                teshu = true;
            }
            if (!xiao && 'a' <= password.charAt(i) && password.charAt(i) <= 'z') {
                xiao = true;
            }
            if (!da && 'A' <= password.charAt(i) && password.charAt(i) <= 'Z') {
                da = true;
            }
            if (!shuzi && '0' <= password.charAt(i) && password.charAt(i) <= '9') {
                shuzi = true;
            }

        }
        if (!teshu || !xiao || !da || !shuzi) {
            return false;
        }
return true;
    }
}

public class LeetCode2299 {
}
