package LeetCode.Easy.MS.MS0304;

import java.util.Stack;

/**
 * @ClassName MS0304
 * @Description TODO
 * @Author point
 * @Date 2023/10/10 23:39
 * @Version 1.0
 */
class MyQueue {
    Stack<Integer> A;

    Stack<Integer> B;

    public MyQueue() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.push(x);
    }

    public int pop() {
        while (!A.isEmpty()) {
            B.push(A.pop());
        }
        int res = B.pop();
        while (!B.isEmpty()) {
            A.push(B.pop());
        }
        return res;
    }

    public int peek() {
        while (!A.isEmpty()) {
            B.push(A.pop());
        }
        int res = B.peek();
        while (!B.isEmpty()) {
            A.push(B.pop());
        }
        return res;
    }

    public boolean empty() {
        return A.isEmpty();
    }
}

public class MS0304 {
}
