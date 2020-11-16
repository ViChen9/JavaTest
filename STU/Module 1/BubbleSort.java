import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //冒泡排序
        //声明随机数组
        int[] num = new int[10];
        for (int a = 0; a < 10; a++) {
            num[a] = (int) (Math.random() * 100);
        }
        System.out.println("数组初始排序为：" + Arrays.toString(num));
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int tem = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tem;
                }
            }
        }
        System.out.println("正在排序中······");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("冒泡排序后的结果为：" + Arrays.toString(num));
    }
}