package Tack3;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-11-20 12:35
 * 编程实现Worker类的测试
 **/
public class WorkerTest {

    public static void main(String[] args) {

        // 1.使用无参方式构造Worker类型的对象并打印特征
        Worker w1 = new Worker();
        w1.show(); // null 0

        System.out.println("------------------------------------------");
        // 2.使用有参方式构造Worker类型的对象并打印特征
        Worker w2 = new Worker("张飞", 30, 3000);
        w2.show();
        // 调用成员方法的测试
        w2.eat("豆芽");
        w2.play("王者荣耀");
        w2.work();
    }
}
