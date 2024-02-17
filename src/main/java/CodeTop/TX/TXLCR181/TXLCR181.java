package CodeTop.TX.TXLCR181;

class Solution {
    public String reverseMessage(String message) {

        String[] split = message.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = split.length - 1; i >= 0; i--) {
            String ii = split[i];
            if (!ii.isEmpty()) {
                stringBuilder.append(ii);
                stringBuilder.append(' ');
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }
}

public class TXLCR181 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseMessage(" "));
        System.out.println(solution.reverseMessage("the sky is blue"));
        System.out.println(solution.reverseMessage("  hello world!  "));
        System.out.println(solution.reverseMessage("a good   example"));
    }
}
