package CodeTop.TX.TX232;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> one;
    private Stack<Integer> two;

    public MyQueue() {
        one = new Stack<>();
        two = new Stack<>();
    }

    public void push(int x) {
        one.add(x);
    }

    public int pop() {
        while (!one.isEmpty()) {
            two.add(one.pop());
        }
        int temp = two.pop();
        while (!two.isEmpty()) {
            one.add(two.pop());
        }
        return temp;
    }

    public int peek() {
        while (!one.isEmpty()) {
            two.add(one.pop());
        }
        int temp = two.peek();
        while (!two.isEmpty()) {
            one.add(two.pop());
        }
        return temp;
    }

    public boolean empty() {
        return one.isEmpty();
    }
}

public class TX232 {
}
