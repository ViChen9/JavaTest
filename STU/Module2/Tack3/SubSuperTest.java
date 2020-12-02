package Tack3;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-01 12:27
 **/
public class SubSuperTest extends SuperTest {

    {
        System.out.println("=======SubSuperTest类中的构造块"); // 第二步执行
    }

    static {
        System.out.println("=======SubSuperTest类中的静态代码块"); // 第一步执行 b
    }

    public SubSuperTest() {
        System.out.println("=======ubSuperTest类中的构造方法体"); // 第三步执行
    }

    public static void main(String[] args) {

        // 使用无参方式构造子类的对象
        SubSuperTest sst = new SubSuperTest();
    }
}
