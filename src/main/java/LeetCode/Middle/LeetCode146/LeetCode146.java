package LeetCode.Middle.LeetCode146;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LeetCode146
 * @Description TODO
 * @Author point
 * @Date 2023/11/25 16:48
 * @Version 1.0
 */
class DoubleList {
    int key;

    int value;

    DoubleList pre;

    DoubleList next;

    public DoubleList() {
    }

    public DoubleList(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    int capacity;

    int size;

    DoubleList head;

    DoubleList tail;

    Map<Integer, DoubleList> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DoubleList();
        tail = new DoubleList();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            DoubleList doubleList = map.get(key);
            move2head(doubleList);

            return doubleList.value;

        }
        return -1;
    }

    private void move2head(DoubleList doubleList) {
        DoubleList pre = doubleList.pre;
        DoubleList next = doubleList.next;
        pre.next = next;
        next.pre = pre;

        next = head.next;
        doubleList.next = next;
        next.pre = doubleList;
        doubleList.pre = head;
        head.next = doubleList;

    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            DoubleList doubleList = map.get(key);
            doubleList.value = value;
            move2head(doubleList);

        } else {
            DoubleList doubleList = new DoubleList(key, value);
            map.put(key, doubleList);
            add2head(doubleList);

            size++;
            if (size > capacity) {
                // 移除
                int removekey = removeTail();
                map.remove(removekey);
                size--;

            }
        }

    }

    private int removeTail() {
        DoubleList remove = tail.pre;
        if (remove == head) {
            return 0;
        }
        tail.pre = remove.pre;
        remove.pre.next = tail;

        remove.next = null;
        remove.pre = null;


        return remove.key;
    }

    private void add2head(DoubleList doubleList) {
        doubleList.next = head.next;
        head.next.pre = doubleList;

        head.next = doubleList;
        doubleList.pre = head;

    }


}

public class LeetCode146 {
}
