package leetcode;

import com.sun.deploy.util.StringUtils;

/**
 * @program: leetcode
 * @description:
 * 示例 1：
 *
 * 输入：address = "1.1.1.1"
 * 输出："1[.]1[.]1[.]1"
 * 示例 2：
 *
 * 输入：address = "255.100.50.0"
 * 输出："255[.]100[.]50[.]0"
 * @author: Mr.Ni
 * @create: 2019-09-02 23:05
 **/

public class IP地址无效化 {
    public static String defangIPaddr(String address) {
        String[] split = address.split("\\.");
        StringBuilder stringBuilder =  new StringBuilder();
        for (int i = 0; i < split.length-1; i++) {
            stringBuilder.append(split[i]+"[.]");
        }
        return stringBuilder.append(split[split.length-1]).toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
