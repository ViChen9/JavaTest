/**
 * 5. 编程题 使用双重循环实现五子棋游戏棋盘的绘制
 */
public class work5 {
    public static void main(String[] args) {
        // 定义二维数组
        String[][] arr2 = new String[17][17];
        // 行
        for (int i = 0; i < arr2.length; i++) {
            // 列
            for (int j = 0; j < arr2[0].length; j++) {
                if (i == 0) {
                    arr2[i][j] = String.format("%x", j - 1);
                } else if (j == 0) {
                    arr2[i][j] = String.format("%x", i - 1);
                } else {
                    arr2[i][j] = "+";
                }
            }
        }
        // 修改第一个元素为空格
        arr2[0][0] = " ";
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
