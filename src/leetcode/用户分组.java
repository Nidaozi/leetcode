package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: leetcode
 * @description: 有 n 位用户参加活动，他们的 ID 从 0 到 n - 1，每位用户都 恰好 属于某一用户组。给你一个长度为 n 的数组 groupSizes，其中包含每位用户所处的用户组的大小，请你返回用户分组情况（存在的用户组以及每个组中用户的 ID）。
 * <p>
 * 你可以任何顺序返回解决方案，ID 的顺序也不受限制。此外，题目给出的数据保证至少存在一种解决方案。
 * 示例 1：
 * <p>
 * 输入：groupSizes = [3,3,3,3,3,1,3]
 * 输出：[[5],[0,1,2],[3,4,6]]
 * 解释：
 * 其他可能的解决方案有 [[2,1,6],[5],[0,4,3]] 和 [[5],[0,6,2],[4,3,1]]。
 * 示例 2：
 * <p>
 * 输入：groupSizes = [2,1,3,3,3,2]
 * 输出：[[1],[0,5],[2,3,4]]
 *  
 * <p>
 * 提示：
 * <p>
 * groupSizes.length == n
 * 1 <= n <= 500
 * 1 <= groupSizes[i] <= n
 * @author: Mr.Ni
 * @create: 2020-01-20 14:47
 **/

public class 用户分组 {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        List<List<Integer>> lists = new ArrayList<>();
        ArrayList list = null;
        for (int i = 0; i < groupSizes.length; i++) {
            Integer count = hash.get(groupSizes[i]);
            if (count == null) {
                hash.put(groupSizes[i], 1);
                list = new ArrayList();
                hashMap.put(groupSizes[i], list);
                list.add(i);
                if (1 == groupSizes[i]) {
                    lists.add(list);
                    hash.remove(groupSizes[i]);
                }

            } else {
                list = hashMap.get(groupSizes[i]);
                hash.put(groupSizes[i], count + 1);
                list.add(i);
                if (count + 1 == groupSizes[i]) {

                    lists.add(list);
                    hash.remove(groupSizes[i]);
                }

            }
        }
        return lists;

    }

    public static void main(String[] args) {
        int[] groupsize = new int[]{3, 3, 3, 3, 3, 1, 3};
        System.out.println(groupThePeople(groupsize));
    }
}
