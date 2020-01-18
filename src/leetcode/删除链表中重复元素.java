package leetcode;

/**
 * @program: demo01
 * @description: 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * @author: Mr.Ni
 * @create: 2019-02-08 21:49
 **/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class 删除链表中重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode phead = head;
        int x = head.val;
        for (ListNode p = head.next, q = head; p != null; p = p.next) {
            if (x != p.val) {
                x = p.val;
                q = q.next;
            } else {
                q.next = p.next;
            }
        }
        return phead;
    }
}
