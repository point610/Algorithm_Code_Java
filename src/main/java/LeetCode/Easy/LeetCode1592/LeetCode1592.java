package LeetCode.Easy.LeetCode1592;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LeetCode1592
 * @Description TODO
 * @Author point
 * @Date 2023/10/12 16:55
 * @Version 1.0
 */
class Solution {
    public String reorderSpaces(String text) {

        int size = text.length();
        if (size == 1) {
            return text;
        }
        int spacenumber = 0;
        for (int i = 0; i < size; i++) {
            if (text.charAt(i) == ' ') {
                spacenumber++;
            }
        }
        String[] strings = text.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals("")) {
                list.add(strings[i]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int addnumber = 0;
        int endspace = 0;
        if (list.size() == 1) {
            endspace = spacenumber;
        } else {
            addnumber = spacenumber / (list.size() - 1);
            endspace = spacenumber % (list.size() - 1);
        }
        size = list.size();
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                stringBuilder.append(list.get(i));
                for (int j = 0; j < endspace; j++) {
                    stringBuilder.append(' ');
                }
            } else {
                stringBuilder.append(list.get(i));
                for (int j = 0; j < addnumber; j++) {
                    stringBuilder.append(' ');
                }
            }
        }
        return stringBuilder.toString();
    }
}

public class LeetCode1592 {
}
