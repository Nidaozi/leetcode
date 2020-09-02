package 阿里巴巴;

import java.util.Scanner;

public class 题目一 {
    private static char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


    //字典序
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = chars.length;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            String str1 = scanner.nextLine();
            String[] s = str1.split(" ");
            char[] stra = s[1].toCharArray();
            char[] strb = s[2].toCharArray();
            if (s[1].compareTo(s[2]) >= 0) {
                System.out.println(0);
                continue;
            }
            int count = 0;
            for (int j = num - 1; j >= 0; j--) {
                count += (strb[j] - stra[j]) * Math.pow(26, num - 1 - j);

            }
            System.out.println(count - 1);
        }

    }
}
