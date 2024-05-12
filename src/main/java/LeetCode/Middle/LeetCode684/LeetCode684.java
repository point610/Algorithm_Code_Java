package LeetCode.Middle.LeetCode684;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        Union union = new Union(edges.length);
        for (int[] edge : edges) {
            int one = union.find(edge[0] - 1);
            int two = union.find(edge[1] - 1);
            if (one != two) {
                union.union(one, two);
            } else {
                return edge;
            }
        }
        return new int[]{0};
    }

    private class Union {
        private int[] parent;
        private int size;

        public Union(int size) {
            this.size = size;
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        private int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        private void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                parent[rootX] = rootY;
            }
        }
    }
}

public class LeetCode684 {
}
