package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2020-01-24 16:03
 **/

public class 猜数字 {
    public int game(int[] guess, int[] answer) {
        int total = 0;
        for (int i = 0; i < guess.length; i++) {
            total += (guess[i]==answer[i] ?1:0);
        }
        return total;
    }
}
