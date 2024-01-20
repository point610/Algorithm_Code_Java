package LeetCode.Easy.LeetCode2946;

class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int index = 0;
        int size = mat[0].length;

        for (int[] aaaaa : mat) {
            if (index % 2 == 0) {
                for (int i = 0; i < size; i++) {
                    int one = aaaaa[i];
                    int two = aaaaa[(i + k) % size];
                    if (one != two) {
                        return false;
                    }
                }
            } else {
                for (int i = 0; i < size; i++) {
                    int one = aaaaa[i];
                    int two = aaaaa[(size * k + i - k) % size];
                    if (one != two) {
                        return false;
                    }
                }
            }
            index++;
        }
        return true;
    }
}

public class LeetCode2946 {
}

