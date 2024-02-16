package CodeTop.TX.TXLCR190;

class Solution {
    public int encryptionCalculate(int dataA, int dataB) {
        while (dataB != 0) {
            int temp = dataA ^ dataB;
            int upper = (dataA & dataB) << 1;
            dataA = temp;
            dataB = upper;
        }
        return dataA;
    }
}

public class TXLCR190 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.encryptionCalculate(5, -1));
    }
}
