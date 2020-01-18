package leetcode;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.*;

/**
 * @program: leetcode
 * @description: 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 * <p>
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 说明：
 * <p>
 * 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/top-k-frequent-elements
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Mr.Ni
 * @create: 2019-12-19 11:17
 **/
public class 前K个高频元素 {
    /*
    * @Description: k = 1很简单,k>1就需要维护一个优先队列
    * @Param: [nums, k]
    * @return: java.util.List<java.lang.Integer>
    * @Author: Mr.Ni
    * @Date: 2019/12/19
    */
    public static List<Integer> topKFrequent(int[] nums, int k) {
        if(nums==null||nums.length<1){
            return null;
        }
        List<Integer> lists = new ArrayList<>();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        //优先队列 默认是小根堆
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2)->(hashMap.get(n1)-hashMap.get(n2)));
        for (int n : hashMap.keySet()) {
            heap.add(n);
            if(heap.size()>k){    //构建一个K个元素的小根堆
                System.out.println(heap.poll());//弹出小根堆的顶也就是最小元素
            }
        }
        while (!heap.isEmpty()){
            lists.add(heap.poll());//输出元素
        }
        Collections.reverse(lists);
        return lists;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1,1,1,4,2,2,3,3,4};
        System.out.println(topKFrequent(num,2));
    }
}

