package Task4;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-07 19:09
 **/
public class Gold implements Metal,Money{
    @Override
    public void shine(){
        System.out.println("发出了金黄色的光芒...");
    }
    @Override
    public void buy(){
        System.out.println("买了好多好吃的...");
    }

    public static void main(String[] args) {
        Metal mt = new Gold();
        mt.shine();

        Money mn = new Gold();
        mn.buy();
    }
}
