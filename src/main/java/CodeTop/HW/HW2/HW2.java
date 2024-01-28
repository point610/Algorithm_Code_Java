package CodeTop.HW.HW2;

import java.math.BigInteger;

/**
 * @ClassName HW2
 * @Description TODO
 * @Author point
 * @Date 2023/12/26 12:03
 * @Version 1.0
 */
class ListNode {
    int val;

    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        BigInteger one = getnumber(l1);
        BigInteger two = getnumber(l2);
        String temp = new StringBuilder(one.add(two).toString()).reverse().toString();
        ListNode head = new ListNode();
        ListNode point = head;
        for (Character cc : temp.toCharArray()) {
            point.next = new ListNode(cc - '0');
            point = point.next;
        }
        return head.next;
    }

    private BigInteger getnumber(ListNode one) {
        StringBuilder stringBuilder = new StringBuilder();
        while (one != null) {
            stringBuilder.insert(0, one.val);
            one = one.next;
        }
        return new BigInteger(stringBuilder.toString());
    }
}

public class HW2 {
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;

        System.out.println(s1 == s2);// false
        System.out.println(s1 == s5);// true
        System.out.println(s1 == s6);// false
        System.out.println(s1 == s6.intern());// true
        System.out.println(s2 == s2.intern());// true-false
        // String 对象的 intern 方法会得到字符串对象在常量池中对应的版本的引用
    }
}
