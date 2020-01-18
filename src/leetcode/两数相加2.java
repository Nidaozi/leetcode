package leetcode;

/**
 * @program: demo01
 * @description: 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并
 * 且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @author: Mr.Ni
 * @create: 2019-04-15 13:16
 **/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class 两数相加2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = l1;
        ListNode listNode1 = l1;
        while(l1.next!=null){
            if(l2 == null){
                break;
            }
            l1.val+=l2.val;
            l1 = l1.next;
            l2 =l2.next;
        }
        if(l2!=null){
            l1.val += l2.val;
            l1.next = l2.next;
        }
        while(listNode.next!=null){
            if(listNode.val>=10){
                listNode.val-=10;
                listNode.next.val++;
            }
            listNode = listNode.next;
        }
        if(listNode.val>=10){
            listNode.val-=10;
            listNode.next = new ListNode(1);
        }
        return listNode1;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(addTwoNumbers(l1,l2));
    }
}

