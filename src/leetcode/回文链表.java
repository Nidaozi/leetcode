package leetcode;

/**
 * @program: demo01
 * @description:
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * @author: Mr.Ni
 * @create: 2019-05-01 18:41
 **/

public class 回文链表 {
    public boolean isPalindrome(ListNode head) {
        int lhash = 0, rhash = 0;
        for(int x = 1; head != null; head = head.next, x *= 11) {
            lhash = lhash*11 + head.val;
            rhash = rhash + head.val*x;
        }
        return lhash == rhash;
    }
}
