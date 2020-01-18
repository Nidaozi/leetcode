package leetcode;

import java.util.Random;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-08-06 19:10
 **/

public class 倍投 {

    public static int beitou(int price,int m ,int n){
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int money = 100;
            for (int j = 0; j < m; j++) {
                int x = random.nextInt();
                if(x>0){
                    price +=money;
                    break;
                }
                price-= money;
                money *=2;
                if(price>105000){
                    return price;
                }
                if (price<0){
                    return price;
                }
                if(price<money){
                    break;
                }
            }

        }
        return price;
    }

    public static void main(String[] args) {
        int price = 100000;
        int m=0;
        int x = 0;
        for (int i = 0; i < 50; i++) {

            int n = beitou(price,5,200);
            x+=n;
            if(n>100000){
                m++;
            }
            System.out.println("当前余额"+n);
        }
        System.out.println("大于本金次数"+m+"综合收益"+x/50);
    }
}
