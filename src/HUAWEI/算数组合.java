package HUAWEI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 算数组合 {
    private static int max = 0;
    private static HashSet<ArrayList<Integer>> set = new HashSet<>();

    public static void main(String[] args) {
        int[] nums = new int[]{4,5};
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums[i]; j++) {
                list.add(1);
            }
            dfs(nums[i], list);
            result += max;
            max = 0;
            set.clear();
        }
        System.out.println(result);
    }

    private static void dfs(int num, ArrayList<Integer> list) {
        ArrayList<Integer> lists = new ArrayList<>(list);
        if (!set.contains(lists)) {
            set.add(new ArrayList<>(lists));
            max++;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (i != j && i < j) {
                    Integer i1 = lists.remove(i);
                    Integer i2 = lists.remove(j - 1);
                    lists.add(i1 + i2);
                    Collections.sort(lists);
                    dfs(num, new ArrayList<>(lists));
                    lists = new ArrayList<>(list);
                } else if (i != j) {
                    Integer i1 = lists.remove(i);
                    Integer i2 = lists.remove(j);
                    lists.add(i1 + i2);
                    Collections.sort(lists);
                    dfs(num, new ArrayList<>(lists));
                    lists = new ArrayList<>(list);
                }
            }
        }
    }
}
