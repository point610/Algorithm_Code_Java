package LeetCode.Middle.LeetCode731;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyCalendarTwo {
    private class Node {
        int one;
        int two;

        public Node(int one, int two) {
            this.one = one;
            this.two = two;
        }
    }

    private List<Node> list;
    private List<Node> cover;

    public MyCalendarTwo() {
        list = new ArrayList<>();
        cover = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        end -= 1;

        for (Node node : cover) {
            if (!(node.two < start || end < node.one)) {
                return false;
            }
        }

        for (Node node : list) {
            if (!(node.two < start || end < node.one)) {
                cover.add(new Node(Math.max(start, node.one), Math.min(end, node.two)));
            }
        }


        Node node = new Node(start, end);
        list.add(node);
        list.sort(Comparator.comparingInt(a -> a.one));
        return true;
    }

}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
public class LeetCode731 {
}
