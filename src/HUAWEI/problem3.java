package HUAWEI;


import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(",");
        String str1 = split[0];
        char[] str = str1.toCharArray();
        int n = Integer.parseInt(split[1]);
        int num = (n - 1) * 2 + 1;
        char[][] chars = new char[700][n];
        int j = 0;
        int index = 0;
        int m = 0;
        for (int i = 0; i < chars.length; i++) {
            if (j < n - 1 - j) {
                if (index < str.length)
                    chars[i][j] = str[index++];
                if (j != n - 1 - j && index < str.length)
                    chars[i][n - 1 - j] = str[index++];
            } else {
                if (j != n - 1 - j && index < str.length)
                    chars[i][n - 1 - j] = str[index++];
                if (index < str.length)
                    chars[i][j] = str[index++];
            }
            if (index == str.length) {
                m = i;
                break;
            }
            j++;
            if (j + 1 == n) {
                j = 0;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int k = 0; k < n; k++) {
            for (int i = 0; i <= m; i++) {
                if (chars[i][k] != '\0') {
                    sb.append(chars[i][k]);
                }
            }
        }
        System.out.println(sb.toString());
    }
    //EIWETGELYORHGSLVNE

}
