package test08;

import java.util.Scanner;

/**
 * 测试类
 */
public class Test {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你要办理的业务：");
        System.out.println("1.国内订单");
        System.out.println("2.国外订单");
        OrderService o = null;
        while(true){
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    o = new OrderServicelmpl();
                    break;
                case 2:
                    o = new OverseasServicelmpl();
                    break;
                default:
                    System.out.println("输入有误");
            }
            if (o != null) {
                o.addOrder();
                o.updateOrder();
                o.deleteOrder();
                o.queryOrder();
                o.cancelOrder();
                o.confirmOrder();
                o.payOrder();
                break;
            } else {
                System.out.println("请重新输入");
            }
        }


    }
}
