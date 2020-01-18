package leetcode;

/**
 * @program: demo01
 * @description:
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * @author: Mr.Ni
 * @create: 2019-03-04 17:49
 **/

public class 调试反转链表 {
    public static ListNode reverseList(ListNode head) {
        ListNode p = null, q = head, m;
        while (q != null) {
            m = q.next;
            q.next = p;
            p = q;
            q=m;
        }
        return p;
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        p1.next = new ListNode(2);
        p1.next.next = new ListNode(3);
        p1.next.next.next = new ListNode(4);
        System.out.println(reverseList(p1));
    }
}
