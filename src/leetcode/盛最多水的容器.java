package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-09-18 11:16
 **/

public class 盛最多水的容器 {
    public static   int maxArea(int[] height){
        int maxArea = 0,l = 0,r = height.length-1;
        while (l<r){
            maxArea = Math.max(maxArea,Math.min(height[r],height[l])*(r-l));
            if(height[l]<height[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[]maxArea = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(maxArea));
    }
}
