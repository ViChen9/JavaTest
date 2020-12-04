package Task4;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-02 11:06
 **/
public class ShapeRectTest {

    public static void main(String[] args) {

        Shape s1 = new Shape(1, 2);
        s1.show();
        System.out.println("----------------------");

        Rect r1 = new Rect(3, 4, 5, 6);
        r1.show();
        System.out.println("----------------------");

        Shape sr = new Rect(7, 8, 9, 10);
        sr.show();
        System.out.println("----------------------");

        int ia = sr.getX();
        System.out.println("获取到的横纵标是:" + ia);
        sr.test();
        Shape.test();
        System.out.println("----------------------");

        int ib = ((Rect) sr).getLen();
        System.out.println("获取到的长度是:" + ib);

        //String str1 = (String)sr;
        if (sr instanceof Circle) {
            System.out.println("可以放心地转换了");
        } else {
            System.out.println("强转有风险，操作需谨慎");
        }
    }
}
