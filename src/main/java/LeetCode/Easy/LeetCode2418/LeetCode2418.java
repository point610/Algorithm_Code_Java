package LeetCode.Easy.LeetCode2418;

import java.util.Arrays;

/**
 * @ClassName LeetCode2418
 * @Description TODO
 * @Author point
 * @Date 2023/10/1 17:13
 * @Version 1.0
 */
class Node {
    String name;

    int height;

    public Node(String name, int height) {
        this.name = name;
        this.height = height;
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        int size = names.length;
        Node[] nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(names[i], heights[i]);
        }
        Arrays.sort(nodes, (o1, o2) -> {
            return o2.height - o1.height;
        });

        for (int i = 0; i < size; i++) {
            names[i]=nodes[i].name;
        }
return names;

    }
}

public class LeetCode2418 {
}
