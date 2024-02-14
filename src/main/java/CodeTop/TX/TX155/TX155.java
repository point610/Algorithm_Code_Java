package CodeTop.TX.TX155;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> mmm;

    public MinStack() {
        stack = new Stack<>();
        mmm = new Stack<>();

    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.add(val);
            mmm.add(val);
            return;
        }

        stack.add(val);
        if (mmm.peek() >= val) {
            mmm.add(val);
        }

    }

    public void pop() {
        int temp = stack.pop();
        if (mmm.peek() == temp) {
            mmm.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mmm.peek();
    }
}

public class TX155 {
}
