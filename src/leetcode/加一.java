package leetcode;

import java.util.Arrays;

/**
 * @program: demo01
 * @description: 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。  最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。  你可以假设除了整数 0 之外，这个整数不会以零开头。
 * @author: Mr.Ni
 * @create: 2019-02-03 16:59
 **/

public class 加一 {
    public static int[] plusOne(int[] digits) {
        if(digits ==null){
            return null;
        }
        digits[digits.length-1]+=1;

        for (int i = digits.length - 1; i > 0; i--) {
            if(digits[i]>9){
                digits[i] -=10;
                digits[i-1]++;
            }else{
                break;
            }
        }
        if(digits[0]>9){
            int[] newDigits = new int[digits.length+1];
            newDigits[0] =1;
            newDigits[1] =0;
            for (int i = 1; i < digits.length; i++) {
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
