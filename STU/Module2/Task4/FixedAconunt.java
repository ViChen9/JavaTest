package Task4;

import javax.security.auth.login.AccountNotFoundException;
import java.util.AbstractCollection;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-07 11:55
 **/
public class FixedAconunt extends Account {
    public FixedAconunt() {
    }

    public FixedAconunt(int i) {
        super(i);
    }

    @Override
    public double getLixi() {
        return getMoney() * 0.03 * 1;
    }

    public static void main(String[] args) {

        //Account acc = new FixedAconunt(1000);
        Account acc = new FixedAconunt();
        acc.setMoney(1000);
        double res = acc.getLixi();
        System.out.println("计算的利息是:" + res);
    }
}
