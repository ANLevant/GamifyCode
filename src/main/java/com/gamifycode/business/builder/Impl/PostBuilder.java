package com.gamifycode.business.builder.Impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.PostDTO;
import com.gamifycode.persistence.model.PostEntity;
import org.springframework.stereotype.Component;

@Component
public class PostBuilder implements EntityDTOBuilder<PostEntity, PostDTO> {

    @Override
    public PostEntity entityToDTO(PostDTO postDTO) {

        PostEntity postEntity = new PostEntity();

        postEntity.setContent(postDTO.getContent());
        postEntity.setIdPost(postDTO.getIdPost());
        postEntity.setTitle(postDTO.getTitle());

        return postEntity;
    }

    @Override
    public PostDTO DTOToEntity(PostEntity postEntity) {

        PostDTO postDTO = new PostDTO();

        postDTO.setContent(postEntity.getContent());
        postDTO.setIdPost(postEntity.getIdPost());
        postDTO.setTitle(postEntity.getTitle());

        return postDTO;
    }
}
