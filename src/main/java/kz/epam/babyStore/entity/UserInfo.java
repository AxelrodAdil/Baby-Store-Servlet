package kz.epam.babyStore.entity;

import java.io.Serializable;

public class UserInfo implements Serializable, Identifiable {

    private Long userInfoId;
    private String userInfoName;
    private String userInfoSurname;
    private Long userInfoPhone;

    public UserInfo() {
    }

    public UserInfo(Long userInfoId, String userInfoName, String userInfoSurname, Long userInfoPhone) {
        this.userInfoId = userInfoId;
        this.userInfoName = userInfoName;
        this.userInfoSurname = userInfoSurname;
        this.userInfoPhone = userInfoPhone;
    }

    @Override
    public Long getId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUserInfoName() {
        return userInfoName;
    }

    public void setUserInfoName(String userInfoName) {
        this.userInfoName = userInfoName;
    }

    public String getUserInfoSurname() {
        return userInfoSurname;
    }

    public void setUserInfoSurname(String userInfoSurname) {
        this.userInfoSurname = userInfoSurname;
    }

    public Long getUserInfoPhone() {
        return userInfoPhone;
    }

    public void setUserInfoPhone(Long userInfoPhone) {
        this.userInfoPhone = userInfoPhone;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userInfoId=" + userInfoId +
                ", userInfoName='" + userInfoName + '\'' +
                ", userInfoSurname='" + userInfoSurname + '\'' +
                ", userInfoPhone=" + userInfoPhone +
                '}';
    }
}
