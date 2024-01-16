package LeetCode.Easy.LeetCode401;

import java.util.*;

/**
 * @ClassName LeetCode401
 * @Description TODO
 * @Author point
 * @Date 2023/7/16 0:01
 * @Version 1.0
 */
class Solution {
    Map<Integer, List<String>> h = new HashMap<>();
    Map<Integer, List<String>> m = new HashMap<>();

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res = new ArrayList<>();
        if (turnedOn < 0 || turnedOn >= 9) {
            return res;
        }

        h.put(0, Arrays.asList(new String[]{"0:"}));
        h.put(1, Arrays.asList(new String[]{"1:", "2:", "4:", "8:"}));
        h.put(2, Arrays.asList(new String[]{"3:", "5:", "9:", "6:", "10:"}));
        h.put(3, Arrays.asList(new String[]{"7:", "11:"}));

        m.put(0, Arrays.asList(new String[]{"00"}));
        m.put(1, Arrays.asList(new String[]{"01", "02", "04", "08", "16", "32"}));
        m.put(2, Arrays.asList(new String[]{"03", "05", "09", "17", "33", "06", "10", "18", "34", "12", "20", "36", "24", "40", "48"}));
        m.put(3, Arrays.asList(new String[]{"07", "11", "19", "35", "13", "21", "37", "25", "41", "49", "14", "22", "38", "26", "42", "50", "28", "44", "52", "56"}));
        m.put(4, Arrays.asList(new String[]{"15", "23", "39", "27", "43", "51", "29", "45", "53", "57", "30", "46", "54", "58"}));
        m.put(5, Arrays.asList(new String[]{"31", "47", "55", "59"}));

        for (int i = 0; i <= turnedOn; i++) {
            int j = turnedOn - i;
            if (!(h.containsKey(i) && m.containsKey(j))) {
                continue;
            }
            List<String> hh = h.get(i);
            List<String> mm = m.get(j);

            for (int k = 0; k < hh.size(); k++) {
                for (int l = 0; l < mm.size(); l++) {
                    res.add(hh.get(k) + mm.get(l));
                }
            }

        }
        return res;
    }
}

public class LeetCode401 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> strings = solution.readBinaryWatch(1);
        strings.forEach(s -> {
            System.out.println(s);
        });
    }
}
