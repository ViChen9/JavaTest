package Task3;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-11-19 19:17
 * 编程实现Singleton类的测试
 **/
public class SingletonTest {

    public static void main(String[] args) {

        // 1.声明SingletonTest类型的引用指向该类型的对象
        //Singleton s1 = new Singleton();
        //Singleton s2 = new Singleton();
        //System.out.println(s1 == s2); // 比较变量s1的数值是否与变量s2的数值是否相等  false
        //Singleton.sin = null;  可以使得引用变量无效
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // ture

    }

}
