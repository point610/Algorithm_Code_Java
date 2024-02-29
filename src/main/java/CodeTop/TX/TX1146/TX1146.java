package CodeTop.TX.TX1146;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

class SnapshotArray {
    List<TreeMap<Integer, Integer>> list = new ArrayList<>();
    int snap = 0;

    public SnapshotArray(int length) {
        for (int i = 0; i < length; i++) {
            list.add(new TreeMap<>());
        }
    }

    public void set(int index, int val) {
        TreeMap<Integer, Integer> treeMap = list.get(index);
        treeMap.put(snap, val);
    }

    public int snap() {
        return snap++;
    }

    public int get(int index, int snap_id) {
        TreeMap<Integer, Integer> treeMap = list.get(index);
        //K	ceilingKey(K key)	返回大于或等于给定键的最小键，如果没有这样的键，则null
        //K	floorKey(K key)	返回小于或等于给定键的最大键，如果没有这样的键，则null
        Integer key = treeMap.floorKey(snap_id);
        return key == null ? 0 : treeMap.get(key);
    }
}

public class TX1146 {
    public static void main(String[] args) {
        SnapshotArray snapshotArray = new SnapshotArray(4);
        snapshotArray.snap();
        snapshotArray.snap();
        System.out.println(snapshotArray.get(3, 1));
        snapshotArray.set(2, 4);
        snapshotArray.snap();
        snapshotArray.set(1, 4);
    }
}
