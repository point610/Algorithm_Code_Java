package CodeTop.XC.XC160;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

 class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode A = headA;
        ListNode B = headB;

        while (A != B) {
            A = (A == null ? headB : A.next);
            B = (B == null ? headA : B.next);
        }
        return A;
    }
}

public class XC160 {
    public static void main(String[] args) {
    }
}
