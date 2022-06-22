package kz.epam.babyStore.entity;

import java.io.Serializable;

public class Product implements Serializable, Identifiable {

    private Long product_id;
    private Long category_id;
    private Long promotion_id;
    private String product_name;
    private String product_description;
    private Double product_price;
    private Boolean product_status;
    private String product_photo_path;
    private Long product_orders_number;

    public Product() {
    }

    public Product(Long product_id, Long category_id, Long promotion_id, String product_name,
                   String product_description, Double product_price, Boolean product_status,
                   String product_photo_path, Long product_orders_number) {
        this.product_id = product_id;
        this.category_id = category_id;
        this.promotion_id = promotion_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_price = product_price;
        this.product_status = product_status;
        this.product_photo_path = product_photo_path;
        this.product_orders_number = product_orders_number;
    }

    @Override
    public Long getId() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public Long getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(Long promotion_id) {
        this.promotion_id = promotion_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public Boolean getProduct_status() {
        return product_status;
    }

    public void setProduct_status(Boolean product_status) {
        this.product_status = product_status;
    }

    public String getProduct_photo_path() {
        return product_photo_path;
    }

    public void setProduct_photo_path(String product_photo_path) {
        this.product_photo_path = product_photo_path;
    }

    public Long getProduct_orders_number() {
        return product_orders_number;
    }

    public void setProduct_orders_number(Long product_orders_number) {
        this.product_orders_number = product_orders_number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", category_id=" + category_id +
                ", promotion_id=" + promotion_id +
                ", product_name='" + product_name + '\'' +
                ", product_description='" + product_description + '\'' +
                ", product_price=" + product_price +
                ", product_status=" + product_status +
                ", product_photo_path='" + product_photo_path + '\'' +
                ", product_orders_number=" + product_orders_number +
                '}';
    }
}
