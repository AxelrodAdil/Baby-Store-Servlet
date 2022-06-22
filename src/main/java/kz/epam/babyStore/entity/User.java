package kz.epam.babyStore.entity;

import java.io.Serializable;

public class User implements Serializable {

    private Long userId;
    private Long userInfoId;
    private Long roleId;
    private String userEmail;
    private String userPassword;
    private Boolean userStatus;

    public User() {
    }

    public User(Long userId, Long userInfoId, Long roleId, String userEmail, String userPassword, Boolean userStatus) {
        this.userId = userId;
        this.userInfoId = userInfoId;
        this.roleId = roleId;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userStatus = userStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Boolean getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userInfoId=" + userInfoId +
                ", roleId=" + roleId +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}
