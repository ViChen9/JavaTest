package Task4;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-07 11:32
 **/
public class SubAbstractTest extends AbstractTest {
    @Override
    public void show() {
        System.out.println("强制重写抽象方法,模板设计模式");
    }

    public static void main(String[] args) {

        SubAbstractTest sat = new SubAbstractTest();
        sat.show();
        System.out.println("----------------------------");

        AbstractTest at = new SubAbstractTest2();
        at.show();
        ((SubAbstractTest2) at).test();
        System.out.println("----------------------------");

        SubAbstractTest2 sat2 = new SubAbstractTest2();
        sat2.test();

    }
}
