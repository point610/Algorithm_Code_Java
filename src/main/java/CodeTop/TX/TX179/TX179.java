package CodeTop.TX.TX179;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
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
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }

        // 判断不能全部都为0
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != '0') {
                return stringBuilder.toString();
            }
        }
        return "0";
    }
}

public class TX179 {
}
