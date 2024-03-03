package CodeTop.HW2.HW1122;

import com.sun.javafx.logging.JFRInputEvent;

import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], Integer.MAX_VALUE);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i : arr1) {
            list.add(i);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1).equals(map.get(o2))) {
                    return o1 - o2;
                }
                return map.get(o1) - map.get(o2);
            }
        });
        for (int i = 0; i < list.size(); i++) {
            arr1[i] = list.get(i);
        }
        return arr1;
    }
}

public class HW1122 {
}
