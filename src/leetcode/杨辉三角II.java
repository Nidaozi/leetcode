package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: demo01
 * @description: 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * @author: Mr.Ni
 * @create: 2019-02-12 12:23
 **/

public class 杨辉三角II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prelist = new ArrayList<>();
        if(rowIndex ==0){
            prelist.add(1);
            return prelist;
        }

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(prelist.get(j-1)+prelist.get(j));
            }
            list.add(1);
            prelist = list;
        }
        return prelist;
    }
}
