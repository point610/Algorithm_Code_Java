package CodeTop.HW.HW85;

import java.util.Stack;

class Solution {
    public int maximalRectangle(char[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int max = 0;

        int[] colsumarr = new int[col];
        for (int j = 0; j < row; j++) {
            char[] currentarr = matrix[j];

            // 计算矩阵的高度值
            for (int k = 0; k < col; k++) {
                if (currentarr[k] == '0') {
                    colsumarr[k] = 0;
                } else {
                    colsumarr[k] += (currentarr[k] - '0');
                }
            }

            max = Math.max(max, largestRectangleArea(colsumarr));

        }
        return max;
    }

    public int largestRectangleArea(int[] heights) {
        int size = heights.length;
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return heights[0];
        }
        Stack<Integer> stack = new Stack<>();
        int aaaa = 0;
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                // 需要对stack进行处理
                int currentheight = heights[stack.pop()];
                // 移出相同高度的index
                while (!stack.isEmpty() && currentheight == heights[stack.peek()]) {
                    stack.pop();
                }
                int currentwidth = 0;
                if (stack.isEmpty()) {
                    currentwidth = i;
                } else {
                    currentwidth = i - stack.peek() - 1;
                }
                aaaa = Math.max(aaaa, currentheight * currentwidth);
            }
            stack.add(i);
        }
        // 清空stack
        while (!stack.isEmpty()) {
            // 移出
            int currentheight = heights[stack.pop()];
            // 移出相同高度的index
            while (!stack.isEmpty() && currentheight == heights[stack.peek()]) {
                stack.pop();
            }
            int currentwidth = 0;
            // 宽度的表示为size，因为已经处理到for循环中 从0 到size-1
            if (stack.isEmpty()) {
                currentwidth = size;
            } else {
                currentwidth = size - stack.peek() - 1;
            }
            aaaa = Math.max(aaaa, currentheight * currentwidth);
        }
        return aaaa;
    }
}

public class HW85 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestRectangleArea(new int[]{2, 1, 2}));
        System.out.println(solution.largestRectangleArea(new int[]{1, 1}));
        System.out.println(solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        System.out.println(solution.largestRectangleArea(new int[]{2, 4}));
    }
}
