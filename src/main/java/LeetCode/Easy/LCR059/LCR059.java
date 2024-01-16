package LeetCode.Easy.LCR059;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LCR059
 * @Description TODO
 * @Author point
 * @Date 2023/10/7 22:16
 * @Version 1.0
 */
class KthLargest {
    List<Integer> list = new LinkedList<>();

    int k;

    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        this.k = k;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            list.add(nums[i]);
        }

    }

    public int add(int val) {
        Iterator<Integer> iterator = list.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            if (val > iterator.next()) {
                index++;
            } else {
                break;
            }
        }
        list.add(index, val);
        return list.get(list.size()  - k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
public class LCR059 {
    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        kthLargest.add(3);   // return 4
        kthLargest.add(5);   // return 5
        kthLargest.add(10);  // return 5
        kthLargest.add(9);   // return 8
        kthLargest.add(4);   // return 8
    }
}
