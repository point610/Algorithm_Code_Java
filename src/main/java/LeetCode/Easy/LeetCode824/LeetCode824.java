package LeetCode.Easy.LeetCode824;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName LeetCode824
 * @Description TODO
 * @Author point
 * @Date 2023/8/11 23:19
 * @Version 1.0
 */
class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        List<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(sentence);
        StringBuilder append = new StringBuilder("a");
        while (matcher.find()) {
            String temp = matcher.group();
            if (set.contains(temp.charAt(0))) {
                temp = temp + "ma" + append;
            } else {
                temp = temp.substring(1) + temp.charAt(0) + "ma" + append;
            }
            list.add(temp);
            append.append('a');
        }
        StringBuilder res = new StringBuilder(list.get(0));
        int size = list.size();
        for (int i = 1; i < size; i++) {
            res.append(' ' + list.get(i));
        }
        return String.valueOf(res);
    }
}

public class LeetCode824 {
}
