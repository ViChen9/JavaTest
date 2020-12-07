package Task4;

/**
 * @program: STU
 * @author: ViChen9
 * @create: 2020-12-07 11:51
 **/
public abstract class Account {
    private double money;

    public Account() {
    }

    public Account(double money) {
        setMoney(money);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money >= 0){
            this.money = money;
        }else {
            System.out.println("金额不合理");
        }
    }

    public abstract double getLixi();

}
