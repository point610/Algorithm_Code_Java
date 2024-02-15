package CodeTop.TX.TXLCR158;

class Solution {
    public int inventoryManagement(int[] stock) {
        int current = stock[0];
        int times = 1;

        for (int i = 1; i < stock.length; i++) {

            if (times == 0) {
                current = stock[i];
                times = 1;
                continue;
            }

            if (current == stock[i]) {
                times++;
            } else {
                times--;
            }

        }
        return current;
    }
}

public class TXLCR158 {
}
