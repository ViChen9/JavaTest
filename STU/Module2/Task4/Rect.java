package Task4;

import org.w3c.dom.xpath.XPathResult;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-02 11:00
 **/
public class Rect extends Shape {
    private int len;
    private int wid;

    public Rect() {
    }

    public Rect(int x, int y, int len, int wid) {
        super(x, y);
        setLen(len);
        setWid(wid);
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        if (len > 0) {
            this.len = len;
        } else {
            System.out.println("长度不合理");
        }

    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        if (wid > 0) {
            this.wid = wid;
        } else {
            System.out.println("宽度不合理");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("长度是:"+getLen()+"宽度是:"+getWid());
    }
}
