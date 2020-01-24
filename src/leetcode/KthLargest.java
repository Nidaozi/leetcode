package leetcode;

import java.util.PriorityQueue;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-24 15:15
 **/

public class KthLargest {
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    public int limit;
    public KthLargest(int k, int[] nums) {
        this.limit = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if(queue.size()<limit){
            queue.add(val);
        }else {
            if(val > queue.peek()){
                queue.poll();
                queue.add(val);
            }
        }
        return queue.peek();
    }
}
