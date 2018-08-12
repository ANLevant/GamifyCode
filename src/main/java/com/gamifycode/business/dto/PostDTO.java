package com.gamifycode.business.dto;

import java.util.Objects;

public class PostDTO {

    private int idPost;

    private int userId;

    private String title;

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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostDTO that = (PostDTO) o;
        return idPost == that.idPost &&
                Objects.equals(title, that.title) &&
                Objects.equals(content, that.content);
    }
}
