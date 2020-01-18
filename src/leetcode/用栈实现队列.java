package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-28 16:53
 **/

import java.util.Stack;

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class 用栈实现队列 {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int front;

    /**
     * Initialize your data structure here.
     */
    public 用栈实现队列() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (s1.empty())
            front = x;
        s1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if(!s2.empty()){
            return s2.peek();
        }
        return front;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.empty()&&s2.empty();
    }
}
