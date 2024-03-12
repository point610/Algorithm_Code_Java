package LeetCode.Middle.LeetCode547;

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

    class UnionFind {
        int father[];
        int rank[];
        int count;

        UnionFind(int size) {
            father = new int[size];
            rank = new int[size];
            count = size;
            for (int i = 0; i < size; i++) {
                father[i] = i;
                rank[i] = 1;
            }
        }

        int find(int x) {
            if (x == father[x]) {
                return x;
            }
            return father[x] = find(father[x]);
        }

        void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                if (rank[rootX] > rank[rootY]) {
                    father[rootY] = rootX;
                } else if (rank[rootX] < rank[rootY]) {
                    father[rootX] = rootY;
                } else {
                    father[rootY] = rootX;
                    rank[rootX] += 1;
                }
                count--;
            }
        }

        int getCount() {
            return count;
        }
    }
}

public class LeetCode547 {
}
