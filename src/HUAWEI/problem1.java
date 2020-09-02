package HUAWEI;


import java.util.ArrayList;
import java.util.Scanner;

public class problem1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        String[] split = sc.nextLine().split(",");
        for (String s : split) {
            nums.add(Integer.parseInt(s));
        }
        int[] moenys = new int[21];
        for (int i = 0; i < nums.size(); i++) {
            int pay = nums.get(i);
            if (pay == 5 || pay == 10 || pay == 20) {
                moenys[pay]++;
                pay -= 5;
                while (pay >= 10 && moenys[10] > 0) {
                    moenys[10]--;
                    pay -= 10;
                }
                while (pay >= 5 && moenys[5] > 0) {
                    moenys[5]--;
                    pay -= 5;
                }
                if (pay > 0) {
                    System.out.println("false," + (i + 1));
                    return;
                }
            } else {
                System.out.println("false," + (i + 1));
                return;
            }

        }
        System.out.println("true," + (nums.size()));
    }
}
