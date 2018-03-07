package idv.ron.easygo.order;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class Order implements Serializable {
    private int orderId;
    private String user;
    private long date;
    private List<OrderProduct> orderProductList;

    public Order(int orderId, String user, long date,
                 List<OrderProduct> orderProductList) {
        super();
        this.orderId = orderId;
        this.user = user;
        this.date = date;
        this.orderProductList = orderProductList;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public List<OrderProduct> getOrderProductList() {
        return orderProductList;
    }

    public void setOrderProductList(List<OrderProduct> orderProductList) {
        this.orderProductList = orderProductList;
    }

}
