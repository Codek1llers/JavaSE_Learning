package test09;

public class CreditCardPaymentImpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("通过信用卡方式支付了" + money + "元");
    }
}
