package leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-21 20:38
 **/

public class 按递增顺序显示卡牌 {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int N = deck.length;
        int[] ans = new int[N];
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < deck.length; i++) {
            queue.add(i);
        }

        for (int num : deck) {
            ans[queue.pollFirst()] = num;
            if(!queue.isEmpty()){
                queue.add(queue.pollFirst());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        按递增顺序显示卡牌 haha = new 按递增顺序显示卡牌();
        int[] ints = haha.deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7});
        System.out.println(Arrays.toString(ints));
    }
}
