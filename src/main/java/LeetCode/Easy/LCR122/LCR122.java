package LeetCode.Easy.LCR122;

/**
 * @ClassName LCR122
 * @Description TODO
 * @Author point
 * @Date 2023/10/8 23:33
 * @Version 1.0
 */
class Solution {
    public String pathEncryption(String path) {
        return path.replaceAll("[.]", " ");
    }
}

public class LCR122 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pathEncryption("a.aef.qerf.bb"));
    }
}
