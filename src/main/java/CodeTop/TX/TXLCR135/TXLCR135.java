package CodeTop.TX.TXLCR135;

class Solution {
    public int[] countNumbers(int cnt) {
        int end = (int) Math.pow(10, cnt);
        int[] list = new int[end - 1];
        for (int i = 1; i < end; i++) {
            list[i - 1] = i;
        }
        return list;
    }
}

public class TXLCR135 {
}
