import java.util.Arrays;

/**
 * 3. 编程题 实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。 其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。
 */
public class work3 {
    public static void main(String[] args) {
        //声明一维数组red的长度
        int[] red = new int[7];
        //跳出多层循环
        label:
        //循环生成红、蓝球随机数
        for (int a = 0; a < red.length; a++) {
            int tem = (int) (Math.random() * 33 + 1);
            //在数组最后直接生成篮球随机数，不做重复对比
            if (red.length - 1 == a) {
                tem = (int) (Math.random() * 16 + 1);
            }
            //遍历数组检查重复随机数，跳过第一位与最后一位
            for (int i = 0; a != 0 && a != 6 && i < a; i++) {
                //如果随机数与数组中的数重复，则抵消本次循环次数，跳回外层循环
                if (tem == red[i]) {
                    a--;
                    continue label;
                }
            }
            //根据循环数组底数将筛选后的随机数写入
            red[a] = tem;
        }
        System.out.printf(Arrays.toString(red));
    }
}