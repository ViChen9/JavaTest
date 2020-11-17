/**
 * 2. 编程题 编程找出 1000 以内的所有完数并打印出来。 所谓完数就是一个数恰好等于它的因子之和，如：6=1＋2＋3
 */
public class Work2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.println(" " + sum);
            }
            sum = 0;
        }
    }
}
