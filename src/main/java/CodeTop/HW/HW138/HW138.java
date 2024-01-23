package CodeTop.HW.HW138;

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
            return null;
        }
        Node one = head.next;
        Node rrrr = new Node(head.val);
        Node two = rrrr;
        Map<Node, Node> map = new HashMap<>();
        Map<Node, Node> real2new = new HashMap<>();
        map.put(head, head.random);
        real2new.put(head, rrrr);
        while (one != null) {
            map.put(one, one.random);

            two.next = new Node(one.val);
            two = two.next;
            real2new.put(one, two);
            one = one.next;
        }

        one = head;
        while (one != null) {
            Node oo = real2new.get(one);
            Node tt = map.get(one);
            if (tt == null) {
                oo.random = null;
            } else {
                oo.random = real2new.get(tt);
            }
            one = one.next;
        }
        return rrrr;
    }
}

public class HW138 {
}
