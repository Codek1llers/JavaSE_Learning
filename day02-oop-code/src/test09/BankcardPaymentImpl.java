package test09;

public class BankcardPaymentImpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("通过银行卡方式支付了" + money + "元");
    }
}
