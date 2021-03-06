package leetcode;

/**
 * @program: demo01
 * @description: 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3 输出：Reference of the node with value = 8 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
 * @author: Mr.Ni
 * @create: 2019-02-28 14:05
 **/

public class 相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA ==null|| headB ==null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA!=pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
