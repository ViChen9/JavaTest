package Task4;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-08 11:59
 **/
public interface Hunter extends Runner{

    public abstract void hunt();

    public default void show1(){
        System.out.println("这是一个接口中的默认功能，实现类可以自由选择是否重写");
    }

    public static void test(){
        System.out.println("这是一个静态方法，可以直接通过接口名.的方式调用，省略对象的创建");
    }
}
