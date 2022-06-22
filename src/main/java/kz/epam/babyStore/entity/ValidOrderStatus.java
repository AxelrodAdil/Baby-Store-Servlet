package kz.epam.babyStore.entity;

import java.io.Serializable;

public class ValidOrderStatus implements Serializable {

    private Long validOrderStatusId;
    private String validOrderStatusName;

    public ValidOrderStatus() {
    }

    public ValidOrderStatus(Long validOrderStatusId, String validOrderStatusName) {
        this.validOrderStatusId = validOrderStatusId;
        this.validOrderStatusName = validOrderStatusName;
    }

    public Long getValidOrderStatusId() {
        return validOrderStatusId;
    }

    public void setValidOrderStatusId(Long validOrderStatusId) {
        this.validOrderStatusId = validOrderStatusId;
    }

    public String getValidOrderStatusName() {
        return validOrderStatusName;
    }

    public void setValidOrderStatusName(String validOrderStatusName) {
        this.validOrderStatusName = validOrderStatusName;
    }

    @Override
    public String toString() {
        return "ValidOrderStatus{" +
                "validOrderStatusId=" + validOrderStatusId +
                ", validOrderStatusName='" + validOrderStatusName + '\'' +
                '}';
    }
}
