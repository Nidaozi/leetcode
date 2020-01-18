package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-09-09 13:00
 **/

public class 公交站间的距离 {
    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum1=0,sum2=0;
        if(destination<start){
            int temp=0;
            temp = start;
            start = destination;
            destination =temp;
        }
        for (int i = start; i < destination; i++) {
            sum1+=distance[i];
        }
        for (int i = destination; i!=start;) {
            sum2+=distance[i];
            i++;
            i%=distance.length;
            if(i==start){
                break;
            }
        }
        return Math.min(sum1,sum2);
    }

    public static void main(String[] args) {
        int[] num ={7,10,1,12,11,14,5,0};
        System.out.println(distanceBetweenBusStops(num,7,2));
    }
}
