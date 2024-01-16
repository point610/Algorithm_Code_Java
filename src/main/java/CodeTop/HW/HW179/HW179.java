package CodeTop.HW.HW179;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName HW179
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 10:12
 * @Version 1.0
 */
class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int ii : nums) {
            list.add(String.valueOf(ii));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String one = o1 + o2;
                String two = o2 + o1;
                return two.compareTo(one);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (String ss : list) {
            stringBuilder.append(ss);
        }
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != '0') {
                return stringBuilder.toString();
            }
        }
        return "0";

    }
}

public class HW179 {
}
