package kz.epam.babyStore.entity;

import java.io.Serializable;

public class BankCard implements Serializable {

    private Long bankCardId;
    private Long user_info_id;
    private Long bank_card_number;
    private Long bank_card_expiration_year;
    private Long bank_card_expiration_month;
    private String bank_card_owner;
    private Long bank_card_cvv;
    private Double bank_card_balance;

    public BankCard() {
    }

    public BankCard(Long bankCardId, Long user_info_id, Long bank_card_number, Long bank_card_expiration_year,
                    Long bank_card_expiration_month, String bank_card_owner, Long bank_card_cvv,
                    Double bank_card_balance) {
        this.bankCardId = bankCardId;
        this.user_info_id = user_info_id;
        this.bank_card_number = bank_card_number;
        this.bank_card_expiration_year = bank_card_expiration_year;
        this.bank_card_expiration_month = bank_card_expiration_month;
        this.bank_card_owner = bank_card_owner;
        this.bank_card_cvv = bank_card_cvv;
        this.bank_card_balance = bank_card_balance;
    }

    public Long getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Long bankCardId) {
        this.bankCardId = bankCardId;
    }

    public Long getUser_info_id() {
        return user_info_id;
    }

    public void setUser_info_id(Long user_info_id) {
        this.user_info_id = user_info_id;
    }

    public Long getBank_card_number() {
        return bank_card_number;
    }

    public void setBank_card_number(Long bank_card_number) {
        this.bank_card_number = bank_card_number;
    }

    public Long getBank_card_expiration_year() {
        return bank_card_expiration_year;
    }

    public void setBank_card_expiration_year(Long bank_card_expiration_year) {
        this.bank_card_expiration_year = bank_card_expiration_year;
    }

    public Long getBank_card_expiration_month() {
        return bank_card_expiration_month;
    }

    public void setBank_card_expiration_month(Long bank_card_expiration_month) {
        this.bank_card_expiration_month = bank_card_expiration_month;
    }

    public String getBank_card_owner() {
        return bank_card_owner;
    }

    public void setBank_card_owner(String bank_card_owner) {
        this.bank_card_owner = bank_card_owner;
    }

    public Long getBank_card_cvv() {
        return bank_card_cvv;
    }

    public void setBank_card_cvv(Long bank_card_cvv) {
        this.bank_card_cvv = bank_card_cvv;
    }

    public Double getBank_card_balance() {
        return bank_card_balance;
    }

    public void setBank_card_balance(Double bank_card_balance) {
        this.bank_card_balance = bank_card_balance;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "bankCardId=" + bankCardId +
                ", user_info_id=" + user_info_id +
                ", bank_card_number=" + bank_card_number +
                ", bank_card_expiration_year=" + bank_card_expiration_year +
                ", bank_card_expiration_month=" + bank_card_expiration_month +
                ", bank_card_owner='" + bank_card_owner + '\'' +
                ", bank_card_cvv=" + bank_card_cvv +
                ", bank_card_balance=" + bank_card_balance +
                '}';
    }
}
