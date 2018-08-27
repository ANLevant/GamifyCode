package com.gamifycode.business.dto;

import java.util.Objects;

public class MenuDTO {

    private int id;
    private String text;
    private String link;
    private String icon;
    private Integer[] idRoleRestriction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer[] getIdRoleRestriction() {
        return idRoleRestriction;
    }

    public void setIdRoleRestriction(Integer[] idRoleRestriction) {
        this.idRoleRestriction = idRoleRestriction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuDTO that = (MenuDTO) o;
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
