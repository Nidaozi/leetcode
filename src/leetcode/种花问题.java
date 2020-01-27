package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-26 15:55
 **/

public class 种花问题 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count =0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]==0 &&((i==0||flowerbed[i-1] ==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0))){
                flowerbed[i] = 1;
                count++;
            }
        }
        return count>=n;
    }
}
