package CodeTop.HW2.HW784;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private char[] temp;
    private List<String> list;

    private void DFS(int index) {
        if (index == temp.length) {
            list.add(new String(temp));
            return;
        }

        while (index < temp.length && !Character.isLowerCase(temp[index])) {
            index++;
        }
        if (index == temp.length) {
            list.add(new String(temp));
            return;
        }
        temp[index] = Character.toUpperCase(temp[index]);
        DFS(index + 1);
        temp[index] = Character.toLowerCase(temp[index]);

        DFS(index + 1);

    }

    public List<String> letterCasePermutation(String s) {
        temp = s.toCharArray();
        list = new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            if (Character.isUpperCase(temp[i])) {
                temp[i] = Character.toLowerCase(temp[i]);
            }
        }

        DFS(0);

        return list;
    }
}

public class HW784 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCasePermutation("a1b2"));
        System.out.println(solution.letterCasePermutation("3z4"));
    }
}
