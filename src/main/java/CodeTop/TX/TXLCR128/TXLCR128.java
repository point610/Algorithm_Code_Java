package CodeTop.TX.TXLCR128;

class Solution {
    public int stockManagement(int[] stock) {
        int left = 0;
        int right = stock.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (stock[mid] < stock[right]) {
                right = mid;
            } else if (stock[right] < stock[mid]) {
                left = mid + 1;
            } else {
                right--;
            }
        }
        return stock[left];
    }
}

public class TXLCR128 {
}
