package LeetCode.Middle.LeetCode1061;

import java.util.*;

class Solution {

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int size = s1.length();
        boolean[][] lll = new boolean[26][26];
        for (int i = 0; i < size; i++) {
            int one = s1.charAt(i) - 'a';
            int two = s2.charAt(i) - 'a';
            lll[one][two] = true;
            lll[two][one] = true;
        }
        boolean[] visit = new boolean[26];

        List<List<Character>> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (!visit[i]) {
                List<Character> temp = new ArrayList<>();
                temp.add((char) (i + 'a'));

                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                visit[i] = true;
                while (!queue.isEmpty()){
                    Queue<Integer> qqqqq = new LinkedList<>();

                    while (!queue.isEmpty()) {
                        int currentindex = queue.poll();
                        visit[currentindex] = true;

                        for (int j = 0; j < 26; j++) {
                            if (lll[currentindex][j] && !visit[j]) {
                                qqqqq.add(j);
                                temp.add((char) (j + 'a'));
                            }
                        }
                    }

                    queue = qqqqq;
                }


                list.add(temp);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list.get(i));
        }
        Map<Character, List<Character>> map = new HashMap<>();
        for (List<Character> templll : list) {
            for (int i = 0; i < templll.size(); i++) {
                map.put(templll.get(i), templll);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            if (!map.containsKey(baseStr.charAt(i))) {
                stringBuilder.append(baseStr.charAt(i));
                continue;
            }

            stringBuilder.append(map.get(baseStr.charAt(i)).get(0));
        }
        return stringBuilder.toString();
    }
}

public class LeetCode1061 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.smallestEquivalentString("leetcode", "programs", "sourcecode"));
        System.out.println(solution.smallestEquivalentString("parker", "morris", "parser"));
        System.out.println(solution.smallestEquivalentString("dfeffdfafbbebbebacbbdfcfdbcacdcbeeffdfebbdebbdafff", "adcdfabadbeeafeabbadcefcaabdecabfecffbabbfcdfcaaae", "myickvflcpfyqievitqtwvfpsrxigauvlqdtqhpfugguwfcpqv"));
        System.out.println(solution.smallestEquivalentString("aabbbabbbbbabbbbaabaabbaaabbbabaababaaaabbbbbabbaa", "aabbaabbbabaababaabaababbbababbbaaaabbbbbabbbaabaa", "buqpqxmnajphtisernebttymtrydomxnwonfhfjlzzrfhosjct"));
        System.out.println(solution.smallestEquivalentString("hello", "world", "hold"));
    }
}
