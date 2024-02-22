package CodeTop.TX.TX138;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        // 处理next的
        Node res = new Node(head.val);
        Node point = res;
        Node temp = head.next;

        Map<Node, Node> map = new HashMap<>();
        map.put(head, res);
        while (temp != null) {
            point.next = new Node(temp.val);
            point = point.next;
            map.put(temp, point);
            temp = temp.next;
        }

        point = res;
        temp = head;
        while (temp != null) {
            point.random = map.get(temp.random);

            point = point.next;
            temp = temp.next;
        }

        return res;
    }
}

public class TX138 {
}



