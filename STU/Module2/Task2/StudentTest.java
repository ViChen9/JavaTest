package Task2;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-11-18 11:02
 * 编程实现Student类的测试
 **/
public class StudentTest {

    public static void main(String[] agrs) {

        // 1.声明一个Student类型的引用指向Student类型的对象
        Student s1 = new Student();
        // 2.对成员变量进行赋值并打印
        //s1.id = 1001;
        //s1.name = "张飞";
        s1.setId(1001);
        s1.setName("张飞");
        s1.show();

        System.out.println("------------------------------------------------");
        // 3.使用有参方式构造对象并打印特征
        Student s2 = new Student(-1001,"张飞");
        s2.show();
    }
}
