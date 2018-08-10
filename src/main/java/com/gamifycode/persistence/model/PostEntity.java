package com.gamifycode.persistence.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(schema = "gamifycode", name = "posts")
public class PostEntity {

    @Id
    @GeneratedValue
    private int idPost;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostEntity that = (PostEntity) o;
        return idPost == that.idPost &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idPost, title, content);
    }
}
