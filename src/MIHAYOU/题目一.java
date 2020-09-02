package MIHAYOU;

import java.util.Scanner;

//分数四则运算
public class 题目一 {
    public static int[] number(String num) {
        String[] split = num.split("/");
        return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        String number1 = s[0];
        String number2 = s[2];
        String op = s[1];
        int[] num1 = number(number1);
        int[] num2 = number(number2);
        int[] result = new int[2];
        switch (op) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = sub(num1, num2);
                break;
            case "*":
                result = mul(num1, num2);
                break;
            case "/":
                result = dev(num1, num2);
                break;
            default:
                break;
        }
        System.out.println(result[0] + "/" + result[1]);
    }

    public static int[] yuefen(int a, int b) {
        boolean flag = false;
        boolean fu = false;
        if (a > 0 && b < 0) {
            fu = true;
            b = 0 - b;
        } else if (a < 0 && b > 0) {
            fu = true;
            a = 0 - a;
        } else if (a < 0 && b < 0) {
            fu = true;
            a = 0 - a;
            b = 0 - b;
        }
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
            flag = true;
        }
        int c = b - a;
        while (c != 0 && c != 1 && a % c == 0 && b % c == 0 || b % a == 0) {
            if (b % a == 0) {
                b /= a;
                a = 1;
                break;
            }
            a /= c;
            b /= c;
            c = b - a;
        }
        if (flag) {
            int temp = b;
            b = a;
            a = temp;
        }
        if (fu) {
            a = -a;
        }
        return new int[]{a, b};
    }

    private static int[] add(int[] num1, int[] num2) {
        int[] result;
        if (num1[1] == num2[1]) {
            num1[0] += num2[0];
            result = yuefen(num1[0], num1[1]);
        } else {
            int ji = num1[1] * num2[1];
            int num = num1[0] * num2[1] + num1[1] * num2[0];
            result = yuefen(num, ji);
        }
        return result;
    }

    private static int[] sub(int[] num1, int[] num2) {
        int[] result;
        if (num1[1] == num2[1]) {
            num1[0] -= num2[0];
            result = yuefen(num1[0], num1[1]);
        } else {
            int ji = num1[1] * num2[1];
            int num = num1[0] * num2[1] - num1[1] * num2[0];
            result = yuefen(num, ji);
        }
        return result;
    }

    private static int[] dev(int[] num1, int[] num2) {
        int[] num3 = new int[]{num2[1], num2[0]};
        return mul(num1, num3);
    }

    private static int[] mul(int[] num1, int[] num2) {
        int[] result;

        int ji = num1[1] * num2[1];
        int num = num1[0] * num2[0];
        result = yuefen(num, ji);
        return result;
    }
}
