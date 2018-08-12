package com.gamifycode.business.service.impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.PostDTO;
import com.gamifycode.business.service.IPostService;
import com.gamifycode.persistence.model.PostEntity;
import com.gamifycode.persistence.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements IPostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private EntityDTOBuilder<PostEntity, PostDTO> builder;

    @Override
    public void addPost(PostDTO postToAddDTO) {
        PostEntity postToAdd = builder.dtoToEntity(postToAddDTO);
        postRepository.save(postToAdd);
    }

    @Override
    public PostDTO getPost(PostDTO postToFetchDTO) {
        PostEntity postFound = postRepository.getOne(postToFetchDTO.getIdPost());

        return builder.entityToDTO(postFound);
    }
}
