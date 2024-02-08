package LeetCode.Hard.LeetCode127;

import java.util.*;

class Solution {
    boolean[][] lll;
    int size;
    int max;

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        boolean hasone = false;
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(beginWord)) {
                hasone = true;
                break;
            }
        }

        if (!hasone) {
            wordList.add(beginWord);
        }

        size = wordList.size();
        lll = new boolean[size][size];
        int startindex = -1;
        int endindex = -1;

        for (int i = 0; i < size; i++) {
            if (wordList.get(i).equals(beginWord)) {
                startindex = i;
            }

            if (wordList.get(i).equals(endWord)) {
                endindex = i;
            }

            for (int j = i + 1; j < size; j++) {
                if (onediff(wordList.get(i), wordList.get(j))) {
                    lll[i][j] = true;
                    lll[j][i] = true;
                }
            }
        }
        if (endindex == -1) {
            return 0;
        }

        max = 0;
        boolean[] visit = new boolean[size];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startindex);
        visit[startindex] = true;

        while (!queue.isEmpty()) {
            Queue<Integer> qqq = new LinkedList<>();
            max++;

            while (!queue.isEmpty()) {
                int tempindex = queue.poll();

                for (int i = 0; i < size; i++) {
                    if (lll[tempindex][i] && !visit[i]) {
                        if (i == endindex) {
                            return max + 1;
                        }
                        visit[i] = true;
                        qqq.add(i);
                    }
                }

            }
            queue = qqq;
        }

        return 0;
    }


    public boolean onediff(String one, String two) {
        int count = 0;
        int size = one.length();
        for (int i = 0; i < size; i++) {
            if (one.charAt(i) != two.charAt(i)) {
                count++;
            }
        }

        return count == 1;
    }
}

public class LeetCode127 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<String> list;
        list = new ArrayList<>();
        list = new ArrayList<>();
        list.add("hot");
        list.add("dog");
        System.out.println(solution.ladderLength("hot", "dog", list));

        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        System.out.println(solution.ladderLength("hit", "cog", list));

        list = new ArrayList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        System.out.println(solution.ladderLength("hit", "cog", list));

        list = new ArrayList<>();
        list.add("hot");
        list.add("dog");
        list.add("dot");
        System.out.println(solution.ladderLength("hot", "dog", list));


    }
}
