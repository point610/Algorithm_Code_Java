package CodeTop.HW.HW151;

/**
 * @ClassName HW151
 * @Description TODO
 * @Author point
 * @Date 2023/12/30 19:11
 * @Version 1.0
 */
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] split = s.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = split.length-1; i>=0; i--) {
            if (split[i].equals("")){
                continue;
            }
            stringBuffer.append(split[i]);
            if (i != 0) {
                stringBuffer.append(' ');
            }
        }
        return stringBuffer.toString();
    }
}

public class HW151 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.reverseWords("a good   example"));
    }
}
