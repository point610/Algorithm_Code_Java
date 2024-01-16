package LeetCode.Middle.LeetCode833;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode833
 * @Description TODO
 * @Author point
 * @Date 2023/8/15 1:23
 * @Version 1.0
 */
class Solution {
    Map<Integer, String[]> map = new HashMap<>();

    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], new String[]{sources[i], targets[i]});
        }

        int size = s.length();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (map.containsKey(i)) {
                int tempSize = map.get(i)[0].length();
                if (i + tempSize <= size && s.substring(i, i + tempSize).equals(map.get(i)[0])) {
                    res.append(map.get(i)[1]);

                } else if (i + tempSize <= size) {
                    // System.out.println("s.substring(i, i + tempSize)" + s.substring(i, i + tempSize));
                    res.append(s.substring(i, i + tempSize));
                }

                // 修改各种下标
                i += tempSize;
                i--;
                continue;
            }
            res.append(s.charAt(i));
        }
        // System.out.println(res);
        return String.valueOf(res);
    }
}

public class LeetCode833 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findReplaceString("abcd", new int[]{0, 2}, new String[]{"a", "cd"}, new String[]{"eee", "ffff"});
    }
}
