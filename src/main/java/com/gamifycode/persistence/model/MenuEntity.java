package com.gamifycode.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "menu", schema = "gamifycode", catalog = "gamifycodedb")
public class MenuEntity {
    private int id;
    private String text;
    private String link;
    private String icon;
    private String idRoleRestriction;

    @Id
    @Column(name = "id_menu_item")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "text_menu_item")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "link_menu_item")
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Basic
    @Column(name = "icon_menu_item")
    public String getIcon() {
        return link;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "id_role_restriction_menu_item")
    public String getIdRoleRestriction() {
        return idRoleRestriction;
    }

    public void setIdRoleRestriction(String idRoleRestriction) {
        this.idRoleRestriction = idRoleRestriction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuEntity that = (MenuEntity) o;
        return id == that.id &&
                Objects.equals(text, that.text) &&
                Objects.equals(link, that.link) &&
                Objects.equals(idRoleRestriction, that.idRoleRestriction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, link, idRoleRestriction);
    }
}
