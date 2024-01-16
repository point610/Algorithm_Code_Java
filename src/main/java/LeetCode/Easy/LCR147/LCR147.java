package LeetCode.Easy.LCR147;

import java.util.Stack;

/**
 * @ClassName LCR147
 * @Description TODO
 * @Author point
 * @Date 2023/10/9 18:39
 * @Version 1.0
 */
class MinStack {
    Stack<Integer> A;

    Stack<Integer> B;

    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        if (B.isEmpty() || B.peek() >= x) {
            B.add(x);
        }
    }

    public void pop() {
        if (A.peek().equals(B.peek())) {
            A.pop();
            B.pop();
        } else {
            A.pop();
        }
    }

    public int top() {
        return A.peek();
    }

    public int getMin() {
        return B.peek();
    }


}

public class LCR147 {
}
