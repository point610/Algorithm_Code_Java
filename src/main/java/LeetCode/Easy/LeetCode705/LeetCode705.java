package LeetCode.Easy.LeetCode705;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName LeetCode705
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 18:02
 * @Version 1.0
 */
class MyHashSet {
    private static final int BASE = 500;

    private LinkedList[] data;

    public MyHashSet() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            data[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {

        if (!contains(key)) {
            data[key % BASE].add(key);
        }
    }

    public void remove(int key) {

        Iterator<Integer> iterator = data[key % BASE].iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == key) {
                data[key % BASE].remove(element);
                return;
            }
        }

    }

    public boolean contains(int key) {

        Iterator<Integer> iterator = data[key % BASE].iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == key) {
                return true;
            }
        }

        return false;
    }

}

public class LeetCode705 {
}
