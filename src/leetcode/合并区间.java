package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-09-02 23:24
 **/

public class 合并区间 {

    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if (intervals == null || intervals.length == 0)
            return res.toArray(new int[0][]);
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }
                return o1[0]-o2[0];
            }
        });
        for (int i = 0; i < intervals.length;i++) {
            if(i!=intervals.length-1&&intervals[i][1]>=intervals[i+1][0]){
                if(intervals[i][1]>=intervals[i+1][1]){
                    if(intervals[i+1][0]>intervals[i][0]){
                        intervals[i+1] =intervals[i];
                    }
                }else {
                intervals[i+1][0] = intervals[i][0];
                }
            }
            else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] merge = merge(new int[][]{{2, 3},{5,5},{2,2},{3,4},{3,4}});
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i][0]+" "+merge[i][1]);
        }

    }
}
