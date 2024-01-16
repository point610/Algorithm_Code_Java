package LeetCode.Middle.LeetCode874;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode874
 * @Description TODO
 * @Author point
 * @Date 2023/7/19 0:12
 * @Version 1.0
 */
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int res = 0;
        Set<Long> set = new HashSet<>();
        int size = obstacles.length;
        for (int i = 0; i < size; i++) {
            set.add((long) (obstacles[i][0] * 60001 + obstacles[i][1]));
        }
        size = commands.length;
        //-2 ：向左转 90 度
        // -1 ：向右转 90 度
        int way = 1;
        int x = 0;
        int y = 0;
        for (int i = 0; i < size; i++) {
            switch (commands[i]) {
                case -1: {
                    way = (way - 1 + 4) % 4;
                    break;
                }
                case -2: {
                    way = (way + 1) % 4;
                    break;
                }
                default: {
                    int step = commands[i];
                    switch (way) {
                        case 0: {
                            for (int j = 0; j < step; j++) {
                                if (set.contains((long) (x + 1) * 60001 + y)) {
                                    break;
                                } else {
                                    x++;
                                }
                            }

                            break;
                        }
                        case 1: {
                            for (int j = 0; j < step; j++) {
                                if (set.contains((long) x * 60001 + y + 1)) {
                                    break;
                                } else {
                                    y++;
                                }
                            }
                            break;
                        }
                        case 2: {
                            for (int j = 0; j < step; j++) {
                                if (set.contains((long) (x - 1) * 60001 + y)) {
                                    break;
                                } else {
                                    x--;
                                }
                            }
                            break;
                        }
                        case 3: {
                            for (int j = 0; j < step; j++) {
                                if (set.contains((long) x * 60001 + y - 1)) {
                                    break;
                                } else {
                                    y--;
                                }
                            }
                            break;
                        }
                    }
                    res = Math.max(res, x * x + y * y);
                }
            }
        }
        // System.out.println(x + " " + y);
        return res;
    }
}

public class LeetCode874 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.robotSim(new int[]{4, -1, 3}, new int[][]{}));
    }
}
