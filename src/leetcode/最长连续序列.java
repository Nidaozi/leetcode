package leetcode;

import java.util.HashSet;
import java.util.Set;

public class 最长连续序列 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<>();
        for (int num : nums) {
            num_set.add(num);
        }
        int longStreak = 0;
        for (int num : num_set) {
            if(!num_set.contains(num-1)){
                int currentStreak = 0;
                int currentNum = num;
                while (num_set.contains(currentNum)){
                    currentStreak++;
                    currentNum++;
                }
                longStreak = Math.max(longStreak,currentStreak);
            }
        }
        return longStreak;
    }

    public static void main(String[] args) {
        最长连续序列 bar
                = new 最长连续序列();
        System.out.println(bar.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
