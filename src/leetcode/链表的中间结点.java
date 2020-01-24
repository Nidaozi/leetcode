package leetcode;

import java.awt.*;

/**
 * @program: leetcode
 * @description: 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * <p>
 * 如果有两个中间结点，则返回第二个中间结点。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 * 示例 2：
 * <p>
 * 输入：[1,2,3,4,5,6]
 * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
 * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
 * @author: Mr.Ni
 * @create: 2020-01-23 18:32
 **/

public class 链表的中间结点 {
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = head, fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }

    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        ListNode last = head;
        while (last.next != null && last.next.next != null) {
            mid = mid.next;
            last = last.next.next;
        }
        return last.next == null ? mid : mid.next;
    }
}
