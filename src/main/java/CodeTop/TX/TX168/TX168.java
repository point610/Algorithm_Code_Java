package CodeTop.TX.TX168;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        while (columnNumber != 0) {
            columnNumber--;
            stringBuilder.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return stringBuilder.reverse().toString();
    }
}

public class TX168 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(1));
    }
}
