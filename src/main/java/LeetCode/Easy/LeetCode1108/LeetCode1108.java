package LeetCode.Easy.LeetCode1108;

/**
 * @ClassName LeetCode1108
 * @Description TODO
 * @Author point
 * @Date 2023/8/18 17:38
 * @Version 1.0
 */
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = address.length();
        for (int i = 0; i < size; i++) {
            if (address.charAt(i) == '.') {
                stringBuilder.append("[.]");
                continue;
            }
            stringBuilder.append(address.charAt(i));
        }
        return String.valueOf(stringBuilder);
    }
}

public class LeetCode1108 {
}
