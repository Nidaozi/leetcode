package leetcode;

/**
 * @program: demo01
 * @description: 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * <p>
 * 注意：
 * 0 ≤ x, y < 231.
 * <p>
 * 示例:
 * <p>
 * 输入: x = 1, y = 4
 * <p>
 * 输出: 2
 * <p>
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * 上面的箭头指出了对应二进制位不同的位置。
 * @author: Mr.Ni
 * @create: 2019-05-01 16:00
 **/

public class 汉明距离 {
    //Integer.bitCount(z)
    public static int hammingDistance(int x, int y) {
        int count = 0;
        int z = x ^ y;
        while (z != 0) {
            count ++;
            z = z&(z-1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
}
