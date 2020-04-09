package leetcode;

import java.util.HashMap;

public class 和为K的子数组 {
    //暴力法很简单,sum+=num就完事了
//    public int subarraySum(int[] nums, int k) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum+=nums[j];
//                if(sum == k){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
    //区间和
    public int subarraySum(int[] nums, int k) {
        int[] sum = new int[nums.length + 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum_i = 0, sum_j = 0, count = 0;
        for (int num : nums) {
            sum_i += num;
            sum_j = sum_i - k;
            if (map.containsKey(sum_j)) {
                count += map.get(sum_j);
            }
            map.put(sum_i, map.getOrDefault(sum_i, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        和为K的子数组 bar = new 和为K的子数组();
        System.out.println(bar.subarraySum(new int[]{1, 1, 1}, 2));

    }
}
