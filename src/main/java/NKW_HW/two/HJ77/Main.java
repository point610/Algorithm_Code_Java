package NKW_HW.two.HJ77;

import java.util.*;

// 思路：主要思想是递归，之所以产生很多方案的原因就是，每次进来一辆火车后，我们将其压入栈中，然后我们可以有两种选择，一是不弹出，二是弹出；
// 对于第二种弹出元素，弹出的个数的范围取决于当前栈中元素的个数，所以遍历每种情况，在遍历每种情况的时候再递归到下一辆火车
public class Main {
    static List<String> list = new ArrayList<>(); //储存结果

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            list.clear(); //静态变量，每次先清空
            int nums = in.nextInt();
            int[] id = new int[nums];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < nums; i++) {
                id[i] = in.nextInt();
            }

            trainOut(id, 0, stack, "", 0);

            //对结果集排序
            Collections.sort(list);
            for (String str : list) {
                System.out.println(str);
            }
        }
        in.close();
    }

    public static void trainOut(int[] id, int index, Stack<Integer> stack, String ss, int n) {
        if (n == id.length) {
            list.add(ss); //如果所有火车均出栈则将当前结果保存
        }

        // 出栈处理
        if (!stack.empty()) { //栈非空时出栈
            int temp = stack.pop();
            trainOut(id, index, stack, ss + temp + " ", n + 1);
            stack.push(temp); //恢复现场
        }

        // 不出栈处理
        // 判断index要小于数组的长度
        if (index < id.length) {
            stack.push(id[index]);
            trainOut(id, index + 1, stack, ss, n);
            stack.pop(); //恢复现场
        }
    }

}


















