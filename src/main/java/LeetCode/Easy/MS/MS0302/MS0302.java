package LeetCode.Easy.MS.MS0302;

import java.util.Stack;

/**
 * @ClassName MS0302
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 22:54
 * @Version 1.0
 */
class MinStack {

    Stack<Integer> a;

    Stack<Integer> b;

    public MinStack() {
        a = new Stack<>();
        b = new Stack<>();
    }


    public void push(int x) {
        a.push(x);
        if (b.isEmpty()) {
            b.push(x);
        } else {
            if (b.peek() >= x) {
                b.push(x);
            }
        }
    }

    public void pop() {
        if (a.pop().equals(b.peek())) {
            b.pop();
        }
    }

    public int top() {
        return a.peek();
    }

    public int getMin() {
        return b.peek();
    }
}

public class MS0302 {
}
