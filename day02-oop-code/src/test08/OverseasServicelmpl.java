package test08;
/**
 * 国外业务，重写接口
 * */
public class OverseasServicelmpl implements OrderService {
    public void check() {
        System.out.println("IP地址检测");
    }
    @Override
    public void addOrder() {
        System.out.println("国外业务——创建订单");
    }

    @Override
    public void updateOrder() {
        System.out.println("国外业务——更新订单");
    }

    @Override
    public void deleteOrder() {
        System.out.println("国外业务——删除订单");
    }

    @Override
    public void queryOrder() {
        System.out.println("国外业务——查询订单");
    }

    @Override
    public void cancelOrder() {
        System.out.println("国外业务——取消订单");
    }

    @Override
    public void confirmOrder() {
        System.out.println("国外业务——确认订单");
    }

    @Override
    public void payOrder() {
        System.out.println("国外业务——支付订单");
    }
}
