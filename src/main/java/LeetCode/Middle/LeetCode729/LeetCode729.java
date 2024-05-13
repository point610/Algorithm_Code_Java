package LeetCode.Middle.LeetCode729;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyCalendar {
    private class Node {
        int one;
        int two;

        public Node(int one, int two) {
            this.one = one;
            this.two = two;
        }
    }

    private List<Node> list;

    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        end -= 1;
        for (Node node : list) {
            if (!(node.two < start || end < node.one)) {
                return false;
            }
        }

        Node node = new Node(start, end);
        list.add(node);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
public class LeetCode729 {
}
