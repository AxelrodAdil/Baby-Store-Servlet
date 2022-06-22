package kz.epam.babyStore.entity;

import java.io.Serializable;

public class Role implements Serializable, Identifiable {

    private Long role_id;
    private String role_name;

    public Role() {
    }

    public Role(Long role_id, String role_name) {
        this.role_id = role_id;
        this.role_name = role_name;
    }

    @Override
    public Long getId() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}
