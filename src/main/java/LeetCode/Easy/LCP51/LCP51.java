package LeetCode.Easy.LCP51;

/**
 * @ClassName LCP51
 * @Description TODO
 * @Author point
 * @Date 2023/9/26 9:17
 * @Version 1.0
 */
class Solution {
    int maxres = -1;

    void DFS(int[] materials, int[][] cookbooks, int[][] attribute, int limit, int meiwei, int baofu, int index) {

        if (baofu >= limit) {
            maxres = Math.max(maxres, meiwei);
        }
        if (index >= cookbooks.length) {
            return;
        }
        // 不加入
        DFS(materials.clone(), cookbooks.clone(), attribute.clone(), limit, meiwei, baofu, index + 1);

        // 加入
        int matersize = materials.length;
        for (int j = 0; j < matersize; j++) {
            if (materials[j] < cookbooks[index][j]) {
                return;
            }
        }
        for (int j = 0; j < matersize; j++) {
            materials[j] -= cookbooks[index][j];
        }
        DFS(materials.clone(), cookbooks.clone(), attribute.clone(), limit, meiwei + attribute[index][0], baofu + attribute[index][1], index + 1);


    }

    public int perfectMenu(int[] materials, int[][] cookbooks, int[][] attribute, int limit) {
        int attrsize = attribute.length;
        int attrsum = 0;
        for (int i = 0; i < attrsize; i++) {
            attrsum += attribute[i][1];
        }
        if (attrsum < limit) {
            return -1;
        }
        DFS(materials.clone(), cookbooks.clone(), attribute.clone(), limit, 0, 0, 0);

        return maxres;
    }
}

public class LCP51 {
}
