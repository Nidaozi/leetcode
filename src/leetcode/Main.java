package leetcode;

import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @program: demo01
 * @description:
 * @author: Mr.Ni
 * @create: 2019-04-14 13:44
 **/

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{
                10007, 10009, 10037, 10039, 10061,
                10067, 10069, 10079, 10091, 10093,
                10099, 10103, 10111, 10133, 10139,
                10141, 10151, 10159, 10163, 10169,
                10177, 10181, 10193, 10211, 10223, 10243, 10247};
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        String str = cin.nextLine();
        HashSet<Integer> hashSet =new HashSet<Integer>();
        for (int i = 0; i < str.length(); i++) {
            int num = 0;
            for (int j = i + 1; j <= str.length(); j++) {
                num = 0;
                int len=1;
                for (int k = i; k < j; k++) {
                    num+=(len++)*nums[(int)(str.charAt(k)-'a')];
                }
                hashSet.add(num);
            }

        }
        System.out.println(hashSet.size());
    }

}
