package leetcode;


import java.util.PriorityQueue;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-24 15:29
 **/

public class 最后一块石头的重量 {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((e1, e2) -> e2 - e1);
        for (int stone : stones) {
            queue.add(stone);
        }
        while (queue.size() >= 2) {
            int num1 = queue.poll();
            int num2 = queue.poll();
            if (num1 != num2) {
                queue.add(num1 - num2);
            }
        }
        return queue.size() == 1 ? queue.poll() : 0;
    }

    public static void main(String[] args) {
        lastStoneWeight(new int[]{1,3});
    }
}
