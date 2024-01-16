package CodeTop.HW.HW735;

import netscape.security.UserTarget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName HW735
 * @Description TODO
 * @Author point
 * @Date 2023/12/26 11:47
 * @Version 1.0
 */
class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> toright = new Stack<>();
        for (int ii : asteroids) {
            if (ii > 0) {
                toright.add(ii);
            } else {
                if (toright.isEmpty() || toright.peek() < 0) {
                    toright.add(ii);
                } else {
                    while (!toright.isEmpty()) {
                        if (toright.peek() < 0) {
                            toright.add(ii);
                            break;
                        }
                        if (toright.peek() == -ii) {
                            toright.pop();
                            break;
                        } else if (toright.peek() < -ii) {
                            toright.pop();
                            if (toright.isEmpty()) {
                                toright.add(ii);
                                break;
                            }
                        } else {
                            break;
                        }
                    }

                }
            }
        }
        int index = toright.size() - 1;
        int[] list = new int[index + 1];
        while (!toright.isEmpty()) {
            list[index--] = toright.pop();
        }
        return list;
    }
}

public class HW735 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{1, -2, -2, -2})));
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{-2, -2, 1, -1})));
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{-2, -2, 1, -2})));
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{-2, -1, 1, 2})));
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{5, 10, -5})));
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{8, -8})));
        System.out.println(Arrays.toString(solution.asteroidCollision(new int[]{10, 2, -5})));
    }
}
