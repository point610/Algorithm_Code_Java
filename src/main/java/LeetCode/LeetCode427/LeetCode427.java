package LeetCode.LeetCode427;

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;


    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}

class Solution {
    public Node construct(int[][] grid) {
        Node node = dfs(grid, 0, 0, grid.length);

        return node;
    }

    private Node dfs(int[][] grid, int x, int y, int n) {
        if (allsame(grid, x,y, n)) {
            return new Node(grid[x][y] == 1, true);
        }
        Node topLeft = dfs(grid, x, y, n / 2);
        Node topRight = dfs(grid, x, y + n / 2, n / 2);
        Node bottomLeft = dfs(grid, x + n / 2, y, n / 2);
        Node bottomRight = dfs(grid, x + n / 2, y + n / 2, n / 2);

        return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
    }

    private boolean allsame(int[][] grid, int x, int y, int n) {
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (grid[i][j] != grid[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }

}

public class LeetCode427 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.construct(new int[][]{{1, 1, 0, 0}, {0, 0, 1, 1}, {1, 1, 0, 0}, {0, 0, 1, 1}}));
        System.out.println(solution.construct(new int[][]{{0, 1}, {1, 0}}));

    }
}
