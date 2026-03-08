package test09;

import test08.OrderServicelmpl;
import test08.OverseasServicelmpl;

import java.util.Scanner;

public class Test09 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Payment p = null;
        while(true){
            System.out.println("请选择你的支付方式：");
            System.out.println("1. 支付平台支付");
            System.out.println("2. 银行卡支付");
            System.out.println("3. 信用卡支付");
            System.out.println("请输入你的支付方式：");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    p = new PlatformPaymentImpl();
                    break;
                case 2:
                    p = new BankcardPaymentImpl();
                    break;
                case 3:
                    p = new CreditCardPaymentImpl();
                    break;
                default:
                    System.out.println("输入有误");
                    continue;
            }
            System.out.println("请输入你要支付的金额：");
            double money = sc.nextDouble();
            p.pay(money);
        }
    }
}
