package CodeTop.HW.HW895;

import java.util.*;

class FreqStack {

    private class Node {
        int value;
        int times;
        Stack<Integer> index = new Stack<>();

        public Node(int value, int times, int index) {
            this.value = value;
            this.times = times;
            this.index.add(index);
        }
    }

    private Map<Integer, Node> map;
    private Queue<Node> queue;
    private int index;

    public FreqStack() {
        map = new HashMap<>();
        queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.times == o2.times) {
                return o2.index.peek() - o1.index.peek();
            }
            return o2.times - o1.times;
        });
        index = 0;
    }

    public void push(int val) {
        if (map.containsKey(val)) {
            queue.remove(map.get(val));
            map.get(val).times++;
            map.get(val).index.add(index);
            queue.offer(map.get(val));
        } else {
            Node node = new Node(val, 1, index);
            map.put(val, node);
            queue.offer(node);
        }
        index++;
    }

    public int pop() {
        Node node = queue.poll();
        node.times--;
        node.index.pop();
        if (node.times == 0) {
            map.remove(node.value);
        } else {
            queue.offer(node);
        }
        return node.value;
    }
}

public class HW895 {
}
