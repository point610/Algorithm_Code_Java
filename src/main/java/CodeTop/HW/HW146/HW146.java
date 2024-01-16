package CodeTop.HW.HW146;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HW146
 * @Description TODO
 * @Author point
 * @Date 2023/12/27 16:47
 * @Version 1.0
 */
class LRUCache {
    private class Node {
        int value;

        int key;

        Node pre;

        Node next;

        public Node() {
        }

        public Node(int value, int key, Node pre, Node next) {
            this.value = value;
            this.key = key;
            this.pre = pre;
            this.next = next;
        }
    }

    private Node head;

    private Node tail;

    private int capacity;

    private int size;

    private Map<Integer, Node> nodeMap;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
        nodeMap = new HashMap<>();

    }

    private void move2head(Node node) {

        Node pre = node.pre;
        Node next = node.next;

        pre.next = next;
        next.pre = pre;

        node.next = head.next;
        node.pre = head;

        head.next.pre = node;
        head.next = node;

    }

    public int get(int key) {
        if (!nodeMap.containsKey(key)) {
            return -1;
        }
        move2head(nodeMap.get(key));
        return nodeMap.get(key).value;

    }

    public void put(int key, int value) {
        if (nodeMap.containsKey(key)) {
            move2head(nodeMap.get(key));
            nodeMap.get(key).value = value;
            return;
        }

        if (size == capacity) {
            movelast();
        }

        Node node = new Node(value, key, head, head.next);

        node.pre = head;
        node.next = head.next;

        head.next.pre = node;
        head.next = node;

        nodeMap.put(key, node);
        size++;
    }

    private void movelast() {
        Node remove = tail.pre;
        nodeMap.remove(remove.key);

        Node pre = remove.pre;
        pre.next = tail;
        tail.pre = pre;

        size--;
    }
}

public class HW146 {
}
