package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-23 18:42
 **/

public class 二进制链表转整数 {
    public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int total = 0;
        while (cur!=null) {
            total *=2;
            total+=cur.val;
            cur = cur.next;
        }
        return total;
    }
}
