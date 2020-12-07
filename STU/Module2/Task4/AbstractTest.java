package Task4;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-07 10:34
 **/
public abstract class AbstractTest {
    private int cnt;

    public AbstractTest() {
    }

    public AbstractTest(int cnt) {
        setCnt(cnt);
    }

    public int getCnt() {
        return cnt;
    }

    public abstract void show();

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public static void main(String[] args) {

//        AbstractTest at = new AbstractTest();
//        System.out.println("at.cnt = " + at.cnt);

    }

}
