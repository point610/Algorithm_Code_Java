package LeetCode.Middle.LeetCode406;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName LeetCode406
 * @Description TODO
 * @Author point
 * @Date 2023/11/25 15:42
 * @Version 1.0
 */
class Node {
    int one;

    int two;

    public Node(int one, int two) {
        this.one = one;
        this.two = two;
    }
}

class Solution {

    public int[][] reconstructQueue(int[][] people) {
        int size = people.length;
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nodes.add(new Node(people[i][0], people[i][1]));
        }
        Collections.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.one == o2.one) {
                    return o1.two - o2.two;
                }
                return o2.one - o1.one;
            }
        });

        List<Node> reslist = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int tempsize = reslist.size();
            if (tempsize <= nodes.get(i).two) {
                reslist.add(nodes.get(i));
            } else {
                reslist.add(nodes.get(i).two, nodes.get(i));
            }
        }

        int[][] res = new int[size][2];
        for (int i = 0; i < size; i++) {
            res[i][0] = reslist.get(i).one;
            res[i][1] = reslist.get(i).two;
        }
        return res;


    }
}

public class LeetCode406 {
    public static void main(String[] args) {

    }
}
