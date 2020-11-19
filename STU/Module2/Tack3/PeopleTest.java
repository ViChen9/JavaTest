package Tack3;

import Tack2.Person;
import com.sun.nio.sctp.PeerAddressChangeNotification;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-11-19 12:16
 * 编程实现People类的测试
 **/
public class PeopleTest {

    public static void main(String[] args) {

        // 3.验证static关键字修饰的静态成员(类成员)是否与创建对象无关 类名.的方式
        //System.out.println("获取到的国籍信息是："+People.country); // null
        System.out.println("获取到的国籍信息是：" + People.getCountry());

        // 1.使用有参方式构造两个People类型的对象并打印特征
        People p1 = new People("张飞", 30/*, "China"*/);
        p1.show();

        People p2 = new People("关羽", 35/*, "China"*/);
        p2.show();

        System.out.println("-----------------------------------------------");
        // 2.验证static关键字修饰的静态成员(类成员)是否被所有对象共享
        //p1.country = "蜀国";
        p1.setCountry("蜀国");
        //System.out.println("第一个对象的国家是" + p1.country); // 蜀国
        //System.out.println("第二个对象的国家是" + p2.country); // 蜀国
        System.out.println("第一个对象的国家是" + p1.getCountry()); // 蜀国
        System.out.println("第二个对象的国家是" + p2.getCountry()); // 蜀国

        People p3 = new People();
        //System.out.println("第三个对象的国家是" + p3.country); // 蜀国
        System.out.println("第三个对象的国家是" + p3.getCountry()); // 蜀国

    }

}
