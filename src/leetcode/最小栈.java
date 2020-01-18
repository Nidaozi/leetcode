package leetcode;



/**
 * @program: demo01
 * @description: 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。  push(x) -- 将元素 x 推入栈中。 pop() -- 删除栈顶的元素。 top() -- 获取栈顶元素。 getMin() -- 检索栈中的最小元素。
 * @author: Mr.Ni
 * @create: 2019-02-21 15:25
 **/

public class 最小栈 {
    /** initialize your data structure here. */
    private static class Node{
        private Node preNode;
        private int min;
        private final int x;
        public Node(int x,Node next){
            this.x = x;
            this.preNode =next;
        }

    }
    private Node node = null;
    public 最小栈() {

    }

    public void push(int x) {
        int min = x;
        if(node!=null&&min>node.min){
            min = node.min;
        }
        node = new Node(x,node);
        node.min = min;
    }

    public void pop() {
        node = node.preNode;
    }

    public int top() {
        return node.x;
    }

    public int getMin() {
        return node.min;
    }
}
