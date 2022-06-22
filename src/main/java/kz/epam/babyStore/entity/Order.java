package kz.epam.babyStore.entity;

import java.io.Serializable;

public class Order implements Serializable {

    private Long orderId;
    private Long orderNumber;
    private Long userId;
    private Long userOrderId;
    private Long productId;

    public Order() {
    }

    public Order(Long orderId, Long orderNumber, Long userId, Long userOrderId, Long productId) {
        this.orderId = orderId;
        this.orderNumber = orderNumber;
        this.userId = userId;
        this.userOrderId = userOrderId;
        this.productId = productId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(Long userOrderId) {
        this.userOrderId = userOrderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNumber=" + orderNumber +
                ", userId=" + userId +
                ", userOrderId=" + userOrderId +
                ", productId=" + productId +
                '}';
    }
}
