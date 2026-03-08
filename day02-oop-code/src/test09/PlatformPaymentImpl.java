package test09;

public class PlatformPaymentImpl implements  Payment{

    @Override
    public void pay(double money) {
        System.out.println("通过平台方式支付了" + money + "元");
    }
}
