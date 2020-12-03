package Task3;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-01 12:21
 **/
public class SuperTest {

    {
        System.out.println("SuperTest类中的构造块"); // 第二步执行
    }

    static {
        System.out.println("SuperTest类中的静态代码块"); // 第一步执行 a
    }

    public SuperTest() {
        System.out.println("SuperTest类中的构造方法体"); // 第三步执行
    }

    public static void main(String[] args) {

        // 使用无参方式构造对象
        SuperTest st = new SuperTest();
    }
}
