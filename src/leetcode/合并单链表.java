package leetcode;

/**
 * @program: demo01
 * @description: 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *              蠢得离谱
 * @author: Mr.Ni
 * @create: 2019-01-26 14:51
 **/

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ListNode p = this;
        String s = "";
        while (p != null) {
            s = s + " " + p.val;
            p = p.next;
        }
        return s;
    }
}

public class 合并单链表 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode l3 = null;
        ListNode p = l3;
        while (l1 != null) {
            if (l2 == null) {
                break;
            }
            if (l1.val < l2.val) {
                if (l3 == null) {
                    l3 = l1;
                    p = l3;
                } else {
                    p.next = l1;
                    p = p.next;
                }
                l1 = l1.next;
            } else {
                if (l3 == null) {
                    l3 = l2;
                    p = l3;
                } else {
                    p.next = l2;
                    p = p.next;
                }
                l2 = l2.next;
            }
        }
        while (l2 != null) {
            p.next = l2;
            p = p.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            p.next = l1;
            p = p.next;
            l1 = l1.next;
        }

        return l3;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4);
//        ListNode p = l1.next;
//        p.next = l2;
//
//        l1.next = l2;
//        System.out.println(l1);
        System.out.println(mergeTwoLists(l1, l2));
    }
}