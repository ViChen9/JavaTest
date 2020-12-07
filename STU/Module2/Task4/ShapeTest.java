package Task4;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-02 10:59
 **/
public class ShapeTest {

    // 矩形
//    public static void draw(Rect r) {
//        r.show();
//    }
    // 圆形
//    public static void draw(Circle c){
//        c.show();
//    }
    // 圆形加矩形
    public static void draw(Shape s){
        s.show();
    }

    public static void main(String[] args) {

        ShapeTest.draw(new Rect(1, 2, 3, 4));
        ShapeTest.draw(new Circle(5,6,7));
    }
}
