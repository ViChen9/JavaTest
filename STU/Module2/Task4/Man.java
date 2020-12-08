package Task4;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-08 12:07
 **/
public class Man implements Hunter{
    @Override
    public void hunt() {
        System.out.println("正在捕猎中...");
    }

    @Override
    public void run() {
        System.out.println("正在逃命中....");
    }

    @Override
    public void show1() {
        System.out.println("show1重写");
    }

    public static void main(String[] args) {
        Hunter hunter = new Man();
        hunter.hunt();
        Runner runner = new Man();
        runner.run();
        System.out.println("-------------------------------");

        Hunter.test();

    }
}
