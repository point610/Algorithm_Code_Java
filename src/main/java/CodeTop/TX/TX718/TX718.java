package CodeTop.TX.TX718;

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        return nums1.length <= nums2.length ? findMax(nums1, nums2) : findMax(nums2, nums1);

    }

    private int findMax(int[] one, int[] two) {
        int onesize = one.length;
        int twosize = two.length;
        int max = 0;

        for (int i = 1; i < onesize; i++) {
            max = Math.max(max, find(one, two, 0, twosize - i, i));
        }

        for (int i = 0, j = i + onesize - 1; j < twosize; j++, i++) {
            max = Math.max(max, find(one, two, 0, i, onesize));
        }

        for (int i = 1; i < onesize; i++) {
            max = Math.max(max, find(one, two, i, 0, onesize - i));
        }

        return max;
    }

    private int find(int[] one, int[] two, int oneindex, int twoindex, int size) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < size; i++, oneindex++, twoindex++) {
            if (one[oneindex] == two[twoindex]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        // 最后一个在for循环结束之后没有计算进max中
        return Math.max(max, count);
    }
}

public class TX718 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}));
        System.out.println(solution.findLength(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0}));
    }
}
