package leetcode;

/**
 * @program: demo01
 * @description: 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * @author: Mr.Ni
 * @create: 2019-03-03 18:49
 **/

public class 移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {

        while(head!=null&&head.val == val){
            head = head.next;
        }
        if(head ==null){
            return null;
        }
        for (ListNode p = head; p.next != null;) {
            if (p.next.val == val) {
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return head;
    }
}
