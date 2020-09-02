package MIHAYOU;

import java.util.ArrayList;
import java.util.Scanner;

public class 题目二 {

    private static int[][] nums;
    private static int m;
    private static int n;
    private static ArrayList<Integer>[] arrayLists;
    private static  boolean cheng = false;
    public static void huishuo(int num,boolean[] flag,int count) {
        if (count == n) {
            cheng = true;
            return;
        }
        boolean chongtu = false;
        for (int i = num; i < m; i++) {
            chongtu = false;
            for (Integer integer : arrayLists[i]) {
                if (flag[integer] == true) {
                    chongtu = true;
                }
            }
            if (chongtu) {
                continue;
            }
            boolean[] flag2 = new  boolean[n];
            int count2 = count;
            for (int i1 = 0; i1 < flag.length; i1++) {
                flag2[i1] = flag[i1];
            }
            for (Integer integer : arrayLists[i]) {
                flag[integer] = true;
                count++;
            }
            if(!cheng)
            huishuo(i+1,flag,count);
            if(!cheng)
            huishuo(i+1,flag2,count2);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         m = scanner.nextInt();
         n = scanner.nextInt();
        nums = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                nums[i][i1] = scanner.nextInt();
            }
        }
        arrayLists = new ArrayList[m];
        for (int i = 0; i < arrayLists.length; i++) {
            arrayLists[i] = new ArrayList();
            for (int j = 0; j < n; j++) {
                if (nums[i][j] == 1) {
                    arrayLists[i].add(j);
                }
            }
        }
        boolean[] flag = new boolean[n];
        int count = 0;
        huishuo(0,flag,count);
        if(cheng){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
