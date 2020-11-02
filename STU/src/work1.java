/**
 * 1. 编程题 提示用户输入年月日信息，判断这一天是这一年中的第几天并打印。
 */

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        System.out.println("请依次输入年月日:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int mount = sc.nextInt();
        int day = sc.nextInt();
        int[] leapYear = {31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
        int num = 0;
        //如果输入月数为1，天数着代表第n天
        if (mount == 1) {
            num = day;
        }
        //判断是否为闰年
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            if (mount > 1 && mount < 13)
                num = leapYear[mount - 2] + day;
            else if (mount > 1 && mount < 13)
                num = leapYear[mount - 2] + day - 1;

        System.out.printf("第" + num + "天");
    }
}
