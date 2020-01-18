package leetcode;


/**
 * @program: demo01
 * @description: 给定一个链表，判断链表中是否有环。  为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * @author: Mr.Ni
 * @create: 2019-02-22 17:43
 **/

public class 环形链表 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next ==null){
            return false;
        }
        if(head.next == head){
            return true;
        }
        for (ListNode p = head,q = head.next; q !=null; q = q.next.next,p = p.next) {
            if( p == q) {
                return true;
            }
            if(q.next == null){
                break;
            }
        }
        return false;
    }
}
