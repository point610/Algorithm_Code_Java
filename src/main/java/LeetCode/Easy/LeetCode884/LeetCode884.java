package LeetCode.Easy.LeetCode884;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName LeetCode884
 * @Description TODO
 * @Author point
 * @Date 2023/8/12 13:48
 * @Version 1.0
 */
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher one = pattern.matcher(s1);
        Matcher two = pattern.matcher(s2);
        Map<String, Integer> map = new HashMap<>();

        Set<String> setOne = new HashSet<>();
        Set<String> tempSet = new HashSet<>();
        Set<String> setTwo = new HashSet<>();
        while (one.find()) {
            String temp = one.group();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            tempSet.add(one.group());
            setOne.add(one.group());
        }
        while (two.find()) {
            String temp = two.group();
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            setTwo.add(temp);
        }

        Iterator<String> iterator = tempSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (setOne.contains(next) && setTwo.contains(next)) {
                setOne.remove(next);
                setTwo.remove(next);
            }
        }
        setOne.addAll(setTwo);

        List<String> res = new ArrayList<>();
        iterator = setOne.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (map.get(next) == 1) {
                res.add(next);
            }
        }

        return res.toArray(new String[0]);

    }
}

public class LeetCode884 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.uncommonFromSentences("this apple is sweet", "this apple is sour");
    }
}
