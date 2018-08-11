package com.gamifycode.business.builder.Impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.PostDTO;
import com.gamifycode.persistence.model.PostEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostBuilder implements EntityDTOBuilder<PostEntity, PostDTO> {

    @Override
    public PostEntity dtoToEntity(PostDTO postDTO) {

        PostEntity postEntity = new PostEntity();

        postEntity.setContent(postDTO.getContent());
        postEntity.setIdPost(postDTO.getIdPost());
        postEntity.setTitle(postDTO.getTitle());

        return postEntity;
    }

    @Override
    public PostDTO entityToDTO(PostEntity postEntity) {

        PostDTO postDTO = new PostDTO();

        postDTO.setContent(postEntity.getContent());
        postDTO.setIdPost(postEntity.getIdPost());
        postDTO.setTitle(postEntity.getTitle());

        return postDTO;
    }

    @Override
    public List<PostEntity> dtoListToEntityList(List<PostDTO> PostDTOList) {
        List<PostEntity> postEntities = new ArrayList<>();

        for(PostDTO postDTO : PostDTOList){
            postEntities.add(this.dtoToEntity(postDTO));
        }

        return postEntities;
    }

    @Override
    public List<PostDTO> entityListToDTOList(List<PostEntity> PostEntityList) {
        List<PostDTO> postDTOs = new ArrayList<>();

        for(PostEntity postEntity : PostEntityList){
            postDTOs.add(this.entityToDTO(postEntity));
        }

        return postDTOs;
    }
}
