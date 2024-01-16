package LeetCode.Easy.LeetCode706;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName LeetCode706
 * @Description TODO
 * @Author point
 * @Date 2023/8/10 18:24
 * @Version 1.0
 */
class MyHashMap {
    class Pair {
        int key;

        int value;

        public Pair() {
        }

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    int BASE = 500;

    LinkedList[] linkedLists;

    public MyHashMap() {
        linkedLists = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            linkedLists[i] = new LinkedList<Pair>();
        }

    }

    public void put(int key, int value) {
        Iterator<Pair> listIterator = linkedLists[key % BASE].iterator();
        while (listIterator.hasNext()) {
            Pair element = listIterator.next();
            if (element.key == key) {
                element.value = value;
                return;
            }
        }
        linkedLists[key % BASE].add(new Pair(key, value));
    }

    public int get(int key) {
        Iterator<Pair> listIterator = linkedLists[key % BASE].iterator();
        while (listIterator.hasNext()) {
            Pair element = listIterator.next();
            if (element.key == key) {
                return element.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        Iterator<Pair> listIterator = linkedLists[key % BASE].iterator();
        while (listIterator.hasNext()) {
            Pair element = listIterator.next();
            if (element.key == key) {
                linkedLists[key % BASE].remove(element);
                return;
            }
        }
    }
}


public class LeetCode706 {

}
