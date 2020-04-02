package leetcode;

public class 面试题数组中重复的数字 {
    public static int findRepeatNumber(int[] nums) {
        int[] tmps = new int[nums.length];
        for (int num : nums) {
            tmps[num]++;
        }
        for (int i = 0; i < tmps.length; i++) {
            if(tmps[i] > 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findRepeatNumber(new int[]{2,3,1,0,2,5,3}));
    }
}
