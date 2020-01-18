package leetcode;
/**
 * @program: demo01
 * @description:
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: dummy->1->2->3->4->5->null, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 *
 * 你能尝试使用一趟扫描实现吗？
 * @author: Mr.Ni
 * @create: 2019-05-01 17:32
 **/

public class 删除链表的倒数第N个节点 {
    //巧妙地利用1个空间避免了 删除头节点的判断
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode frist = dummy;
        ListNode second = dummy;
        for (int i = 0; i <= n ; i++) {
            frist = frist.next;
        }
        while (frist!=null){
            frist= frist.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        System.out.println(removeNthFromEnd(listNode,1));
    }
}
