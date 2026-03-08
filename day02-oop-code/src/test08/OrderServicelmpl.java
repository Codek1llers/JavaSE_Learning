package test08;

public class OrderServicelmpl implements OrderService{
    @Override
    public void addOrder() {
        System.out.println("添加订单");
    }

    @Override
    public void updateOrder() {
        System.out.println("修改订单");
    }

    @Override
    public void deleteOrder() {
        System.out.println("删除订单");
    }

    @Override
    public void queryOrder() {
        System.out.println("查询订单");
    }

    @Override
    public void cancelOrder() {
        System.out.println("取消订单");
    }

    @Override
    public void confirmOrder() {
        System.out.println("确认订单");
    }

    @Override
    public void payOrder() {
        System.out.println("支付订单");
    }
}
