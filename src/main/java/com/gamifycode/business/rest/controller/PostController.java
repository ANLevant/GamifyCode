package com.gamifycode.business.rest.controller;

import com.gamifycode.business.dto.PostDTO;
import com.gamifycode.business.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private IPostService postService;

    @RequestMapping(method = RequestMethod.POST)
    public void addPost(PostDTO postToAddDTO) {
        postService.addPost(postToAddDTO);
    }

    @RequestMapping(method = RequestMethod.GET)
    public PostDTO getPost(PostDTO postToFetchDTO) {
        return postService.getPost(postToFetchDTO);
    }
}
