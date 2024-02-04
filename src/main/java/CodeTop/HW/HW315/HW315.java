package CodeTop.HW.HW315;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * 辅助数组
     */
    private int[] aux;
    /**
     * 计数数组
     */
    private int[] counter;
    /**
     * 索引数组
     */
    private int[] indexes;

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int size = nums.length;
        if (size == 0) {
            return result;
        }

        aux = new int[size];
        counter = new int[size];
        indexes = new int[size];

        for (int i = 0; i < size; i++) {
            indexes[i] = i;
        }

        mergeAndCountSmaller(nums, 0, size - 1);

        for (int i = 0; i < size; i++) {
            // 不是引用类型数组，只能通过for循环添加
            result.add(counter[i]);
        }

        return result;
    }

    /**
     * 针对数组 nums 指定的区间 [left, right] 进行归并排序，在排序的过程中完成统计任务
     *
     * @param nums  数组
     * @param left  左边界
     * @param right 右边界
     */
    private void mergeAndCountSmaller(int[] nums, int left, int right) {
        if (left == right) {
            // 数组只有一个元素的时候，没有比较，不统计
            return;
        }

        // 相对的中间位置
        int mid = left + (right - left) / 2;
        // 对左边[left, mid]排序
        mergeAndCountSmaller(nums, left, mid);
        // 对右边[mid + 1, right]排序
        mergeAndCountSmaller(nums, mid + 1, right);

        // 归并排序的优化，同样适用于该问题
        if (nums[indexes[mid]] > nums[indexes[mid + 1]]) {
            // 最后只剩两个数，如果存在逆序关系时才进行统计
            mergeOfTwoSortedArrAndCountSmaller(nums, left, mid, right);
        }
    }

    /**
     * 左边[left, mid] 是排好序的
     * 右边[mid + 1, right] 是排好序的
     * 统计当前元素右边逆序对个数
     *
     * @param nums  数组
     * @param left  左边界
     * @param mid   中间值
     * @param right 右边界
     */
    private void mergeOfTwoSortedArrAndCountSmaller(int[] nums, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            // 1、此处与归并排序不同
            // 辅助数组初始化，存放的是索引，即我们归并的不是数组元素，而是数组索引，nums仅用来判断是否有逆序对
            aux[i] = indexes[i];
        }
        int i = left;
        int j = mid + 1;
        // 左边归并的时候统计，即索引i增加的时候才统计逆序对的个数
        // 此时右边已经归并的元素都比i对应的元素要小，
        // 也就是说，右边已经归并的元素个数就是逆序对的个数。
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                // 左边元素用尽，取右边元素
                indexes[k] = aux[j++];
            } else if (j > right) {
                // 右边元素用尽，取左边元素
                indexes[k] = aux[i++];

                // 2、此处是根据问题追加的逆序对计数
                // indexes[k]可以和右边[mid + 1, right]构成逆序对，长度为right - (mid + 1) + 1，即right - mid
                counter[indexes[k]] += (right - mid);
            } else if (nums[aux[i]] > nums[aux[j]]) {
                // 3、此处与归并排序不同，索引是辅助数组aux
                // 取最小的，即右边元素
                indexes[k] = aux[j++];
            } else {
                // 取最小的，即左边元素
                indexes[k] = aux[i++];

                // 4、此处是根据问题追加的逆序对计数
                // ndexes[k]可以和右边[mid + 1, j)构成逆序对，长度为j - (mid + 1)，即j - mid - 1
                counter[indexes[k]] += (j - mid - 1);
            }
        }
    }
}

public class HW315 {
}
