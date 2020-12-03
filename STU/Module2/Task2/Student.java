package Task2;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-11-18 10:58
 * 编程实现Student类的封装
 **/
public class Student {

    // 1.私有化成员变量，使用private关键字修饰
    // private关键字修饰表示私有的含义，也就是该成员变量只能在当前类的内部使用
    private int id;      // 用于描述学号的成员变量
    private String name; // 用于描述姓名的成员变量

    public Student() { }
    public Student(int id, String name) {
        //this.id = id;
        //this.name = name;
        setId(id);
        setName(name);
    }

    // 2.提供共有的get和set方法，并在方法体中进行合理的判断
    // 使用public关键字修饰表示公有的含义，也就是该方法可以在任意位置使用
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("学号不合理");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // 自定义成员方法实现特征的打印
    void show() {
        //System.out.println("我是" + name + "，学号是" + id);
        System.out.println("我是" + getName() + "，学号是" + getId());
    }
}
