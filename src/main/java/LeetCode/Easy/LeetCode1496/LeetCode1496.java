package LeetCode.Easy.LeetCode1496;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LeetCode1496
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 16:10
 * @Version 1.0
 */
class Solution {
    int step = 100000;

    public boolean isPathCrossing(String path) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int x = 0;
        int y = 0;
        int size = path.length();
        for (int i = 0; i < size; i++) {
            switch (path.charAt(i)) {
                case 'N': {
                    y++;
                    break;
                }
                case 'S': {
                    y--;
                    break;
                }
                case 'W': {
                    x--;
                    break;
                }
                case 'E': {
                    x++;
                    break;
                }
            }
            int temp = x * step + y;
            if (set.contains(temp)) {
                return true;
            }
            set.add(temp);
        }
        return false;

    }
}

public class LeetCode1496 {
}
