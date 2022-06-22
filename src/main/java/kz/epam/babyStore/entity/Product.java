package kz.epam.babyStore.entity;

import java.io.Serializable;

public class Product implements Serializable {

    private Long productId;
    private Long categoryId;
    private Long promotionId;
    private String productName;
    private String productDescription;
    private Double productPrice;
    private Boolean productStatus;
    private String productPhotoPath;
    private Long productOrdersNumber;

    public Product() {
    }

    public Product(Long productId, Long categoryId, Long promotionId, String productName,
                   String productDescription, Double productPrice, Boolean productStatus, String productPhotoPath,
                   Long productOrdersNumber) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.promotionId = promotionId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
        this.productPhotoPath = productPhotoPath;
        this.productOrdersNumber = productOrdersNumber;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductPhotoPath() {
        return productPhotoPath;
    }

    public void setProductPhotoPath(String productPhotoPath) {
        this.productPhotoPath = productPhotoPath;
    }

    public Long getProductOrdersNumber() {
        return productOrdersNumber;
    }

    public void setProductOrdersNumber(Long productOrdersNumber) {
        this.productOrdersNumber = productOrdersNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", categoryId=" + categoryId +
                ", promotionId=" + promotionId +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productPrice=" + productPrice +
                ", productStatus=" + productStatus +
                ", productPhotoPath='" + productPhotoPath + '\'' +
                ", productOrdersNumber=" + productOrdersNumber +
                '}';
    }
}
