package CodeTop.TX.TX225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> one;
    Queue<Integer> two;

    private boolean isone;

    public MyStack() {
        one = new LinkedList<>();
        two = new LinkedList<>();
        isone = true;
    }

    public void push(int x) {
        if (isone) {
            one.offer(x);
        } else {
            two.offer(x);
        }
    }

    public int pop() {
        if (isone) {
            isone = false;
            while (one.size() > 1) {
                two.add(one.poll());
            }
            int temp = one.poll();
            return temp;
        } else {
            isone = true;
            while (two.size() > 1) {
                one.add(two.poll());
            }
            int temp = two.poll();
            return temp;
        }
    }

    public int top() {
        if (isone) {
            isone = false;
            while (one.size() > 1) {
                two.add(one.poll());
            }
            int temp = one.poll();
            two.add(temp);
            return temp;
        } else {
            isone = true;
            while (two.size() > 1) {
                one.add(two.poll());
            }
            int temp = two.poll();
            one.add(temp);
            return temp;
        }
    }

    public boolean empty() {
        if (isone) {
            return one.isEmpty();
        } else {
            return two.isEmpty();
        }
    }
}

public class TX225 {
}
