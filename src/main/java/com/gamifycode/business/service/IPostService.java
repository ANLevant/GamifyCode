package com.gamifycode.business.service;

import com.gamifycode.business.dto.PostDTO;

public interface IPostService {
    void addPost(PostDTO postToAddDTO);
    PostDTO getPost(PostDTO postToFetchDTO);
}
