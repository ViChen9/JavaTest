package Tack3;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-11-20 12:34
 * 自定义Worker类继承自Person类
 **/
public class Worker extends Person {

    private int salary;

    public Worker() {
        System.out.println("Worker()");
    }

    public Worker(String name, int age, int salary) {
        System.out.println("Worker(String, int, int)");
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 2200) {
            this.salary = salary;
        } else {
            System.out.println("薪水不合理");
        }
    }

    // 自定义成员方法描述工作的行为
    public void work() {
        System.out.println("今天的砖头有点烫手...");
    }
}
