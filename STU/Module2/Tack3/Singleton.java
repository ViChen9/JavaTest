package Tack3;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-11-19 19:03
 * 变成实现Singleton类的封装
 **/
public class Singleton {

    // 2.声明奔雷类型的引用指向本类类型的对象，使用private static关键字共同修饰
    private static Singleton sin = new Singleton();

    // 1.私有化构造方法，使用private关键字修饰
    private Singleton(){}

    // 3.提供共有的get方法负责将对象返回出去，使用public static关键字共同修饰
    public static Singleton getInstance(){
        return sin;
    }

}
