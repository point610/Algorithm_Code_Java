package CodeTop.TX.TX1013;

class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        if (sum % 3 != 0) {
            return false;
        }

        int avg = sum / 3;
        // one
        int temp = 0;
        int leftindex = 0;
        while (leftindex < size) {
            temp += arr[leftindex];
            if (temp == avg) {
                break;
            }
            leftindex++;
        }

        // two
        temp = 0;
        int rightindex = size - 1;
        while (0 <= rightindex) {
            temp += arr[rightindex];
            if (temp == avg) {
                break;
            }
            rightindex--;
        }

        // 判断
        if (leftindex + 1 >= rightindex) {
            return false;
        }

        return true;
    }
}

public class TX1013 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
        System.out.println(solution.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
        System.out.println(solution.canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
    }
}
