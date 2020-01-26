package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-24 20:03
 **/

public class 按奇偶排序数组 {
    public int[] sortArrayByParity(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2 ==0){
                int temp = A[i];
                A[i] = A[index];
                A[index++] = temp;
            }
        }
        return A;
    }
}
