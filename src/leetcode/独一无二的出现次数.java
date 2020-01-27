package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-26 12:07
 **/

public class 独一无二的出现次数 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size()==set.size();
    }
}
