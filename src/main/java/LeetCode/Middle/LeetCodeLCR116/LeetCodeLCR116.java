package LeetCode.Middle.LeetCodeLCR116;

class Solution {
    public int findCircleNum(int[][] isConnected) {

        if (isConnected == null || isConnected.length == 0) {
            return 0;
        }
        int size = isConnected.length;
        UnionFind unionFind = new UnionFind(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isConnected[i][j] == 1) {
                    unionFind.union(i, j);
                }
            }
        }
        return unionFind.count;
    }

    private class UnionFind {
        int[] father;
        int[] rank;
        int count;

        public UnionFind(int size) {
            father = new int[size];
            rank = new int[size];
            count = size;
            for (int i = 0; i < size; i++) {
                father[i] = i;
                rank[i] = i;
            }
        }

        int find(int one) {
            if (father[one] == one) {
                return one;
            }
            father[one] = find(father[one]);
            return father[one];
        }

        void union(int one, int two) {
            int oo = find(one);
            int tt = find(two);
            if (oo == tt) {
                return;
            }
            if (rank[oo] > rank[tt]) {
                father[tt] = oo;
            } else if (rank[oo] < rank[tt]) {
                father[oo] = tt;
            } else {
                father[tt] = oo;
                rank[oo]++;
            }
            count--;
        }

    }
}

public class LeetCodeLCR116 {
}
