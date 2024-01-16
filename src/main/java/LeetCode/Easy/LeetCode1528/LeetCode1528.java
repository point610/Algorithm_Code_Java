package LeetCode.Easy.LeetCode1528;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName LeetCode1528
 * @Description TODO
 * @Author point
 * @Date 2023/9/27 23:01
 * @Version 1.0
 */
class Node {
    char c;

    int index;

    public Node(char c, int index) {
        this.c = c;
        this.index = index;
    }
}

class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = indices.length;
        Node[] nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(s.charAt(i), indices[i]);
        }
        Arrays.sort(nodes, Comparator.comparingInt(o -> o.index));
        for (int i = 0; i < size; i++) {
            stringBuilder.append(nodes[i].c);
        }
        return stringBuilder.toString();
    }
}

public class LeetCode1528 {
}
