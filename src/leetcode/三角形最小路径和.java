package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-30 10:13
 **/

public class 三角形最小路径和 {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] num = new int[triangle.size()];
        for (int i = 0; i < triangle.size(); i++) {
            num[i] = triangle.get(triangle.size()-1).get(i);
        }
        for (int i = triangle.size()-2; i >=0 ; i--) {
            for (int j = 0; j <= i; j++) {
                num[j] = Math.min(num[j],num[j+1])+triangle.get(i).get(j);
            }
        }
        return num[0];
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        lists.add(Arrays.asList(2));
        lists.add(Arrays.asList(3,4));
        lists.add(Arrays.asList(6,5,7));
        lists.add(Arrays.asList(4,1,8,3));
        System.out.println(minimumTotal(lists));

    }
}
