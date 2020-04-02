package leetcode;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        while (cin.hasNext()){
//            Main m = new Main();
//            int num = cin.nextInt();
//            for (int i = 0; i < num; i++) {
//                System.out.println(m.bar(cin.nextInt()));
//
//            }
//        }
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        while(sc.hasNext()) {
            int num = sc.nextInt();
            for(int i=0; i<num; i++) {
                System.out.println(m.bar(sc.nextInt()));
            }
        }
    }
    public int bar(int n){
        int a = 0,b=1;
        while (n-->0){
            int c = b;
            b = a+b;
            a = c;
        }
        return a;
    }
}
