package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo01
 * @description:
 * 输入一个按升序排序的整数数组（可能包含重复数字），你需要将它们分割成几个子序列，其中每个子序列至少包含三个连续整数。返回你是否能做出这样的分割？
 *
 *
 *
 * 示例 1：
 *
 * 输入: [1,2,3,3,4,5]
 * 输出: True
 * 解释:
 * 你可以分割出这样两个连续子序列 :
 * 1, 2, 3
 * 3, 4, 5
 *
 *
 * 示例 2：
 *
 * 输入: [1,2,3,3,4,4,5,5]
 * 输出: True
 * 解释:
 * 你可以分割出这样两个连续子序列 :
 * 1, 2, 3, 4, 5
 * 3, 4, 5
 *
 *
 * 示例 3：
 *
 * 输入: [1,2,3,4,4,5]
 * 输出: False
 *
 *
 * 提示：
 *
 * 输入的数组长度范围为 [1, 10000]
 * @author: Mr.Ni
 * @create: 2019-05-07 09:49
 **/

public class 分割数组为连续子序列 {
    public boolean isPossible(int[] nums) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int num : nums) {
            if(map1.containsKey(num)){
                map1.put(num,map1.get(num)+1);
            }else{
                map1.put(num,1);
            }
        }
        for (int num : nums) {
            if(map1.get(num)==0){ //次数为0
                continue;
            }else if(map2.containsKey(num-1)&&map2.get(num-1)>0){
                map2.put(num-1,map2.get(num-1)-1);
                map2.put(num,map2.getOrDefault(num,0)+1);
            }else if(map1.containsKey(num+1)&&map1.containsKey(num+2)&&map1.get(num+1)>0&&map1.get(num+2)>0){
                map1.put(num+1,map1.get(num+1)-1);
                map1.put(num+2,map1.get(num+2)-1);
                map2.put(num+2,map2.getOrDefault(num+2,0)+1);
            }else {
                return false;
            }
            map1.put(num,map1.get(num)-1);
        }
        return true;
    }
}
