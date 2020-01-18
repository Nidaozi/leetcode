package leetcode;

/**
 * @program: leetcode
 * @description:
 * @author: Mr.Ni
 * @create: 2019-09-09 12:25
 **/

public class 一周中的第几天 {
    private static String[] result ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static int[] monthday = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static String dayOfTheWeek(int day, int month, int year) {
        int index = 4;
        int inityear = 1971;
        while (year-inityear>0){
            index+=run(inityear++)?366:365;
        }
        for (int i = 0; i < month-1; i++) {
            if(i==1&&run(year)){
                index+=29;
            }else {
                index+=monthday[i];
            }
        }
        index+=day;
        return result[index%7];
    }
    public static boolean run(int num){
        return (num%4==0&&num%100!=0)||num%400==0;
    }

    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(18,7,1999).equals("Sunday"));
        System.out.println(dayOfTheWeek(31,8,2019));
        System.out.println(dayOfTheWeek(15,8,1993));
    }
}
