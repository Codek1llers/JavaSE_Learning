package test08;
/**
 * 订单业务接口
 */
public interface OrderService {
    /**
     * 添加订单
     */
    void addOrder();
    /**
     * 修改订单
     */
    void updateOrder();
    /**
     * 删除订单
     */
    void deleteOrder();
    /**
     * 查询订单
     */
    void queryOrder();
    /**
     * 取消订单
     */
    void cancelOrder();
    /**
     * 确认订单
     */
    void confirmOrder();
    /**
     * 支付订单
     */
    void payOrder();

}
