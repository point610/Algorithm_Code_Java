package CodeTop.HW.HW406;

import com.sun.org.apache.xerces.internal.impl.dv.util.ByteListImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName HW406
 * @Description TODO
 * @Author point
 * @Date 2023/12/29 19:58
 * @Version 1.0
 */
    class Solution {
        class Node {
            int val;

            int pre;

            public Node(int val, int pre) {
                this.val = val;
                this.pre = pre;
            }
        }

        public int[][] reconstructQueue(int[][] people) {

            List<Node> list = new ArrayList<>();

            for (int[] iii : people) {
                list.add(new Node(iii[0], iii[1]));

            }
            Collections.sort(list, (o1, o2) -> {
                if (o1.val == o2.val) {
                    return o1.pre - o2.pre;
                }
                return o2.val - o1.val;
            });

            // 开始插队
            List<Node> llll = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                int tempsize = llll.size();
                Node node = list.get(i);
                if (tempsize <= node.pre) {
                    llll.add(node);
                } else {
                    llll.add(node.pre, node);
                }
            }

            int[][] res = new int[llll.size()][2];
            for (int i = 0; i < llll.size(); i++) {
                res[i][0] = llll.get(i).val;
                res[i][1] = llll.get(i).pre;
            }
            return res;
        }
    }

public class HW406 {
}
