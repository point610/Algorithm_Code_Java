package CodeTop.TX.TX706;

import java.util.ArrayList;
import java.util.List;

class MyHashMap {
    private class Node {
        int key;
        int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<List<Node>> list;
    private int size = 500;

    public MyHashMap() {
        list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new ArrayList<>());
        }
    }

    public void put(int key, int value) {
        int index = getindex(key);
        Node node = new Node(key, value);

        if (get(key) != -1) {
            List<Node> nodes = list.get(index);
            for (int i = 0; i < nodes.size(); i++) {
                if (nodes.get(i).key == key) {
                    nodes.get(i).value = value;
                    break;
                }
            }

        } else {
            list.get(index).add(node);
        }

    }

    public int get(int key) {
        int index = getindex(key);
        if (list.get(index) == null || list.get(index).isEmpty()) {
            return -1;
        }

        for (Node node : list.get(index)) {
            if (node.key == key) {
                return node.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        if (get(key) == -1) {
            return;
        }
        int index = getindex(key);
        List<Node> nodes = list.get(index);

        int removeindex = 0;
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).key == key) {
                removeindex = i;
                break;
            }
        }
        nodes.remove(removeindex);

    }

    private int getindex(int key) {
        return key % size;
    }
}

public class TX706 {
}
