package kz.epam.babyStore.entity;

import java.io.Serializable;
import java.util.Date;

public class UserOrder implements Serializable {

    private Long userOrderId;
    private String userOrderAddress;
    private Date userOrderDate;
    private Date userOrderDeliveryDate;
    private Long userOrderStatusId;

    public UserOrder() {
    }

    public UserOrder(Long userOrderId, String userOrderAddress, Date userOrderDate, Date userOrderDeliveryDate,
                     Long userOrderStatusId) {
        this.userOrderId = userOrderId;
        this.userOrderAddress = userOrderAddress;
        this.userOrderDate = userOrderDate;
        this.userOrderDeliveryDate = userOrderDeliveryDate;
        this.userOrderStatusId = userOrderStatusId;
    }

    public Long getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(Long userOrderId) {
        this.userOrderId = userOrderId;
    }

    public String getUserOrderAddress() {
        return userOrderAddress;
    }

    public void setUserOrderAddress(String userOrderAddress) {
        this.userOrderAddress = userOrderAddress;
    }

    public Date getUserOrderDate() {
        return userOrderDate;
    }

    public void setUserOrderDate(Date userOrderDate) {
        this.userOrderDate = userOrderDate;
    }

    public Date getUserOrderDeliveryDate() {
        return userOrderDeliveryDate;
    }

    public void setUserOrderDeliveryDate(Date userOrderDeliveryDate) {
        this.userOrderDeliveryDate = userOrderDeliveryDate;
    }

    public Long getUserOrderStatusId() {
        return userOrderStatusId;
    }

    public void setUserOrderStatusId(Long userOrderStatusId) {
        this.userOrderStatusId = userOrderStatusId;
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "userOrderId=" + userOrderId +
                ", userOrderAddress='" + userOrderAddress + '\'' +
                ", userOrderDate=" + userOrderDate +
                ", userOrderDeliveryDate=" + userOrderDeliveryDate +
                ", userOrderStatusId=" + userOrderStatusId +
                '}';
    }
}
