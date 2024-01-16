package LeetCode.Easy.LeetCode1507;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode1507
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 16:18
 * @Version 1.0
 */
class Solution {
    String getDay(String day) {
        if (day.length() == 3) {
            return "0" + day.charAt(0);
        } else {
            return day.substring(0, 2);
        }
    }

    public String reformatDate(String date) {
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        String[] strings = date.split(" ");


        return strings[2] + "-" + map.get(strings[1]) + "-" + getDay(strings[0]);
    }
}

public class LeetCode1507 {
    public static void main(String[] args) {
    }
}
