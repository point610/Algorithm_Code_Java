package CodeTop.HW.HW460;

import java.util.*;

class LFUCache {

    Map<Integer, Node> cache;
    Queue<Node> queue;
    int capacity;
    int size;
    int idx = 0;

    public LFUCache(int capacity) {
        cache = new HashMap<>(capacity);
        if (capacity > 0) {
            queue = new PriorityQueue<>(capacity);
        }
        this.capacity = capacity;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        node.freq++;
        node.idx = idx++;
        queue.remove(node);
        queue.offer(node);
        return node.value;

    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        Node node = cache.get(key);
        if (node != null) {
            node.value = value;
            node.freq++;
            node.idx = idx++;

            queue.remove(node);
            queue.offer(node);
        } else {
            if (size == capacity) {
                cache.remove(queue.peek().key);
                queue.poll();
                size--;
            }

            Node newNode = new Node(key, value, idx++);
            cache.put(key, newNode);
            queue.offer(newNode);
            size++;
        }
    }
}

class Node implements Comparable<Node> {
    int key;
    int value;
    int freq;
    int idx;

    public Node() {
    }

    public Node(int key, int value, int idx) {
        this.key = key;
        this.value = value;
        freq = 1;
        this.idx = idx;
    }

    public int compareTo(Node node) {
        int diff = freq - node.freq;
        // 频率相同，比较index
        return diff != 0 ? diff : idx - node.idx;
    }
}


public class HW460 {
    public static void main(String[] args) {

        LFUCache lfuCache = new LFUCache(2);
        lfuCache.put(1, 1);
        lfuCache.put(2, 2);
        System.out.println(lfuCache.get(1));
        lfuCache.put(3, 3);
        System.out.println(lfuCache.get(2));
        System.out.println(lfuCache.get(3));
        lfuCache.put(4, 4);
        System.out.println(lfuCache.get(1));
        System.out.println(lfuCache.get(3));
        System.out.println(lfuCache.get(4));
    }
}
