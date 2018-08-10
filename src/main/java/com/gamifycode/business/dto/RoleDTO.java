package com.gamifycode.business.dto;

import java.util.Objects;

public class RoleDTO {

    private int idRole;

    private String roleName;

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleDTO that = (RoleDTO) o;
        return idRole == that.idRole &&
                Objects.equals(roleName, that.roleName);
    }
}
