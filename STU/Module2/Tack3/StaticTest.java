package Tack3;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-11-19 12:48
 * 编程实现static关键字的使用
 **/
public class StaticTest {

    private int cnt = 1; // 隶属于对象层级，也就是每个对象都拥有独立的一份
    private static int snt = 2; // 隶属于类成绩，也就是所有对象都共享同一份

    // 自定义非静态的成员变量  需要使用引用.的方式访问
    public void show(){
        System.out.println("cnt = " + cnt); // 1
        System.out.println("snt = " + snt); // 2  静态成员被所有对象共享，this关键字可以省略
    }
    // 自定义静态的成员方法 推荐使用类名.的方式访问
    public static void test(){

        //System.out.println("cnt = " + cnt); // 1  静态成员方法中没有this关键字，因为是可以通过类名.方法调用的
        System.out.println("snt = " + snt); // 2
    }

    public static void main(String[] arg){

        StaticTest st = new StaticTest();
        st.show();

        System.out.println("---------------------------------------------------------");
        StaticTest.test();
    }
}
