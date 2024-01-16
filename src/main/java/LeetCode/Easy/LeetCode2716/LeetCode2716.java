package LeetCode.Easy.LeetCode2716;

/**
 * @ClassName LeetCode2716
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:54
 * @Version 1.0
 */
class Solution {
    public int minimizedStringLength(String s) {
        int[] arr = new int[26];
        int size = s.length();
        for (int i = 0; i < size; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int times = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                times++;
            }
        }
return times;
    }
}

public class LeetCode2716 {
}
