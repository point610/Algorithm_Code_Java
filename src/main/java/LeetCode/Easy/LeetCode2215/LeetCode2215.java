package LeetCode.Easy.LeetCode2215;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LeetCode2215
 * @Description TODO
 * @Author point
 * @Date 2023/9/30 18:17
 * @Version 1.0
 */
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int onesize = nums1.length;
        int twosize = nums2.length;
        int oneindex = 0;
        int twoindex = 0;
        List<Integer> onelist = new LinkedList<>();
        List<Integer> twolist = new LinkedList<>();

        while (oneindex < onesize && twoindex < twosize) {
            if (nums1[oneindex] == nums2[twoindex]) {
                oneindex++;
                twoindex++;
            } else if (nums1[oneindex] < nums2[twoindex]) {
                onelist.add(nums1[oneindex]);
                oneindex++;
            } else {
                twolist.add(nums2[twoindex]);
                twoindex++;
            }

            // move oneindex and twoindex
            while (oneindex >= 1 && oneindex < onesize && nums1[oneindex] == nums1[oneindex - 1]) {
                oneindex++;
            }
            while (twoindex >= 1 && twoindex < twosize && nums2[twoindex] == nums2[twoindex - 1]) {
                twoindex++;
            }
        }
        while (oneindex >= 1 && oneindex < onesize && nums1[oneindex] == nums1[oneindex - 1]) {
            oneindex++;
        }
        while (oneindex < onesize) {
            onelist.add(nums1[oneindex]);
            oneindex++;
            while (oneindex >= 1 && oneindex < onesize && nums1[oneindex] == nums1[oneindex - 1]) {
                oneindex++;
            }
        } while (twoindex >= 1 && twoindex < twosize && nums2[twoindex] == nums2[twoindex - 1]) {
            twoindex++;
        }
        while (twoindex < twosize) {

            twolist.add(nums2[twoindex]);
            twoindex++; while (twoindex >= 1 && twoindex < twosize && nums2[twoindex] == nums2[twoindex - 1]) {
                twoindex++;
            }
        }
        List<List<Integer>>
                res = new LinkedList<>();
        res.add(onelist);
        res.add(twolist);
        return res;
    }
}

public class LeetCode2215 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});
    }
}
