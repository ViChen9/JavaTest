package Tack3;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-01 17:01
 **/
public class FinalMenberTest {
    //    private final int cnt = 1; // 显示初始化
    private final int cnt;

    /*{
        cnt = 2; // 构造块中进行初始化
    }*/

    public FinalMenberTest() {
        cnt = 3; // 构造方法体中进行初始化
    }

    public static void main(String[] args) {

        // 声明FinalMenberTest类型的引用指向该类的对象
        FinalMenberTest fmt = new FinalMenberTest();
        // 打印成员变量的数值
        System.out.println("fmt.cnt = " + fmt.cnt); // 0
    }

}
