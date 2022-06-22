package kz.epam.babyStore.entity;

import java.io.Serializable;
import java.util.Date;

public class Promotion implements Serializable, Identifiable {

    private Long promotionId;
    private Boolean promotionStatus;
    private String promotionName;
    private String promotionDescription;
    private Long promotionDiscountPercent;
    private Date promotionBeginningDate;
    private Date promotionExpirationDate;
    private String promotionPhotoPath;

    public Promotion() {
    }

    public Promotion(Long promotionId, Boolean promotionStatus, String promotionName, String promotionDescription,
                     Long promotionDiscountPercent, Date promotionBeginningDate, Date promotionExpirationDate,
                     String promotionPhotoPath) {
        this.promotionId = promotionId;
        this.promotionStatus = promotionStatus;
        this.promotionName = promotionName;
        this.promotionDescription = promotionDescription;
        this.promotionDiscountPercent = promotionDiscountPercent;
        this.promotionBeginningDate = promotionBeginningDate;
        this.promotionExpirationDate = promotionExpirationDate;
        this.promotionPhotoPath = promotionPhotoPath;
    }

    @Override
    public Long getId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Boolean getPromotionStatus() {
        return promotionStatus;
    }

    public void setPromotionStatus(Boolean promotionStatus) {
        this.promotionStatus = promotionStatus;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public String getPromotionDescription() {
        return promotionDescription;
    }

    public void setPromotionDescription(String promotionDescription) {
        this.promotionDescription = promotionDescription;
    }

    public Long getPromotionDiscountPercent() {
        return promotionDiscountPercent;
    }

    public void setPromotionDiscountPercent(Long promotionDiscountPercent) {
        this.promotionDiscountPercent = promotionDiscountPercent;
    }

    public Date getPromotionBeginningDate() {
        return promotionBeginningDate;
    }

    public void setPromotionBeginningDate(Date promotionBeginningDate) {
        this.promotionBeginningDate = promotionBeginningDate;
    }

    public Date getPromotionExpirationDate() {
        return promotionExpirationDate;
    }

    public void setPromotionExpirationDate(Date promotionExpirationDate) {
        this.promotionExpirationDate = promotionExpirationDate;
    }

    public String getPromotionPhotoPath() {
        return promotionPhotoPath;
    }

    public void setPromotionPhotoPath(String promotionPhotoPath) {
        this.promotionPhotoPath = promotionPhotoPath;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "promotionId=" + promotionId +
                ", promotionStatus=" + promotionStatus +
                ", promotionName='" + promotionName + '\'' +
                ", promotionDescription='" + promotionDescription + '\'' +
                ", promotionDiscountPercent=" + promotionDiscountPercent +
                ", promotionBeginningDate=" + promotionBeginningDate +
                ", promotionExpirationDate=" + promotionExpirationDate +
                ", promotionPhotoPath='" + promotionPhotoPath + '\'' +
                '}';
    }
}
