package LeetCode.Middle.LeetCode1352;

/**
 * @ClassName LeetCode1352
 * @Description TODO
 * @Author point
 * @Date 2023/8/14 0:05
 * @Version 1.0
 */
class ProductOfNumbers {

    int[] pre = new int[40010];

    int size = 0;

    public ProductOfNumbers() {
        pre[0] = 1;
    }

    public void add(int num) {
        if (num == 0) {
            size = 0;
        } else {
            size++;
            pre[size] = num;
            pre[size] *= pre[size - 1];
        }
    }

    public int getProduct(int k) {
        if (size < k) {
            return 0;
        }
        return pre[size] / pre[size - k];
    }
}

public class LeetCode1352 {
}
