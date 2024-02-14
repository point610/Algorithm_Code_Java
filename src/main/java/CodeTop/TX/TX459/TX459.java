package CodeTop.TX.TX459;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // 匹配的字符串不为第二个字符串
        return (s + s).indexOf(s, 1) != s.length();
    }
}

public class TX459 {
}
