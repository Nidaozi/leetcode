package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 *
 * 示例:
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 * @author: Mr.Ni
 * @create: 2020-01-20 19:36
 **/

public class 全排列 {
    public int length;
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> outputlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList();
        for (int num : nums) {
            list.add(num);
        }
        length = nums.length;
        backtrack(outputlist, list,0);
        return  outputlist;
    }

    private void backtrack(List<List<Integer>> outputlist, ArrayList<Integer> list, int index) {
        if(index == length){
            outputlist.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < length; i++) {
            Collections.swap(list,index,i);
            backtrack(outputlist,list,index+1);
            Collections.swap(list,index,i);
        }
    }

    public static void main(String[] args) {
        全排列 mute = new 全排列();
        List<List<Integer>> lists = mute.permute(new int[]{1, 2, 3});
        System.out.println(lists);
    }
}
