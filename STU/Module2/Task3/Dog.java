package Task3;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-01 11:50
 **/
public class Dog extends Animal {
    private int tooth;

    public Dog() {
        super(); // 表示调用父类的无参构造方法
    }

    public Dog(String name, String color, int tooth) {
        super(name, color); // 表示调用父类的有参构造
        setTooth(tooth);
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        if (tooth > 0) {
            this.tooth = tooth;
        } else {
            System.out.println("牙齿数量不合理");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("牙齿数量是：" + getTooth());
    }
}
