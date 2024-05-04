package LeetCode.Easy.LeetCode3127;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canMakeSquare(char[][] grid) {
        if (can(grid)) {
            return true;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('B', 'W');
        map.put('W', 'B');
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = map.get(grid[i][j]);
                if (can(grid)) {
                    return true;
                }
                grid[i][j] = map.get(grid[i][j]);
            }
        }

        return false;
    }

    private boolean can(char[][] grid) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if ((grid[i][j] == 'W' && grid[i + 1][j] == 'W' && grid[i][j + 1] == 'W' && grid[i + 1][j + 1] == 'W') || (grid[i][j] == 'B' && grid[i + 1][j] == 'B' && grid[i][j + 1] == 'B' && grid[i + 1][j + 1] == 'B')) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class LeetCode3127 {
}
