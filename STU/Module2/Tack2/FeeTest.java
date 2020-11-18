package Tack2;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-11-18 10:52
 * 编程实现对费氏数列类的测试    测试类
 **/
public class FeeTest {
    public static void main(String[] args) {

        // 1.声明FeeTest类型的引用指向该类型的对象
        Fee ft = new Fee();
        // 2.调用方法算并打印
        int res = ft.show(5);
        System.out.println("计算的结果是" + res); // 5
    }
}
