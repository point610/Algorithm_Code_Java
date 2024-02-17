package CodeTop.TX.TX146;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LRUCache {
    private class Node {
        int key;
        int value;
        Node pre;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, Node> map;
    private Node head;
    private Node end;
    private int capacity;
    private int size;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        size = 0;
        head = new Node(0, 0);
        end = new Node(0, 0);
        head.next = end;
        end.pre = head;
    }

    private void movetohead(Node node) {
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
        if (map.containsKey(key)) {
            // 移动到前面
            Node node = map.get(key);
            movetohead(node);

            return node.value;
        }
        return -1;
    }

    private void removeend() {
        Node node = end.pre;
        end.pre = node.pre;
        node.pre.next = end;

        map.remove(node.key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            // 移动到前面
            Node node = map.get(key);
            node.value = value;
            movetohead(node);
        } else {
            if (size == capacity) {
                removeend();

                Node node = new Node(key, value);
                map.put(key, node);

                // 加入head
                node.next = head.next;
                node.pre = head;

                head.next.pre = node;
                head.next = node;

            } else {
                Node node = new Node(key, value);
                map.put(key, node);

                // 加入head
                node.next = head.next;
                node.pre = head;

                head.next.pre = node;
                head.next = node;

                size++;
            }
        }
    }

}

public class TX146 {
}
