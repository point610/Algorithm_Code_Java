package CodeTop.TX.TXLCR120;

class Solution {
    public int findRepeatDocument(int[] documents) {
        for (int i = 0; i < documents.length; i++) {
            if (i == documents[i]) {
                continue;
            }

            if (documents[documents[i]] == documents[i]) {
                return documents[i];
            }

            // 交换，使得temp的下标数组处对齐
            int temp = documents[i];
            documents[i] = documents[temp];
            documents[temp] = temp;
            // 继续判断当前位置的数组
            i--;
        }
        return 0;
    }
}

public class TXLCR120 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findRepeatDocument(new int[]{3, 1, 2, 3}));
    }
}
