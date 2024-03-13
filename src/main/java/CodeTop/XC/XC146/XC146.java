package CodeTop.XC.XC146;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    private class Node {
        int value;
        int key;
        Node pre;
        Node next;

        public Node(int value, int key, Node pre, Node next) {
            this.value = value;
            this.key = key;
            this.pre = pre;
            this.next = next;
        }
    }

    private Node head;
    private Node end;

    private int capacity;
    private int size;
    private Map<Integer, Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;

        head = new Node(0, 0, null, null);
        end = new Node(0, 0, null, null);

        head.next = end;
        end.pre = head;
        map = new HashMap<>();
    }

    private void move2head(Node one) {
        one.pre.next = one.next;
        one.next.pre = one.pre;

        one.pre = head;
        one.next = head.next;
        head.next.pre = one;
        head.next = one;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            move2head(map.get(key));
            return map.get(key).value;
        }
        return -1;
    }

    private void del() {
        size--;
        Node delnode = end.pre;

        end.pre = delnode.pre;
        delnode.pre.next = end;

        delnode.next = null;
        delnode.pre = null;

        map.remove(delnode.key);
    }

    private void add2head(Node one) {
        Node temp = head.next;

        one.next = temp;
        one.pre = head;

        temp.pre = one;
        head.next = one;

        size++;

        map.put(one.key, one);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.get(key).value = value;
            // 移动到最前面
            move2head(map.get(key));
        } else {
            if (size == capacity) {
                del();
            }
            add2head(new Node(value, key, null, null));
        }
    }
}

public class XC146 {
}





