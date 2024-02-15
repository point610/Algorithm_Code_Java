package CodeTop.TX.TXLCR187;

class Solution {
    public int iceBreakingGame(int num, int target) {

        int aaa = 0;
        for (int i = 2; i <= num; i++) {
            aaa = (aaa + target) % i;
        }

        return aaa;

    }
}

public class TXLCR187 {
}
