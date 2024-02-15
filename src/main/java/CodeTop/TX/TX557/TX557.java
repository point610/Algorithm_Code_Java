package CodeTop.TX.TX557;

class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == ' ') {
                // 加入新的单词
                res.append(temp.reverse());
                temp = new StringBuilder();
                res.append(' ');
            } else {
                temp.append(s.charAt(i));
            }
        }
        res.append(temp.reverse());
        return res.toString();
    }
}

public class TX557 {
}
