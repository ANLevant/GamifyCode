package com.gamifycode.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(schema = "gamifycode", name = "roles")
public class RoleEntity {

    @Id
    @GeneratedValue
    private int idRole;

    @Column(name = "ROLE_NAME")
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
        RoleEntity that = (RoleEntity) o;
        return idRole == that.idRole &&
                Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idRole, roleName);
    }
}
