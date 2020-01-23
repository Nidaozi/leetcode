package leetcode;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-23 15:33
 **/

public class 数组的相对排序 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = index; j < arr1.length; j++) {
                if(arr1[j] == arr2[i]){
                    int temp = arr1[j];
                    arr1[j] = arr1[index];
                    arr1[index++] = temp;
                }

            }
        }
        Arrays.sort(arr1,index,arr1.length);
        return arr1;
    }
}
