package com.gamifycode.business.builder.Impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.persistence.model.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserBuilder implements EntityDTOBuilder<UserEntity, UserDTO> {

    @Override
    public UserEntity entityToDTO(UserDTO userDTO){

        UserEntity userEntity = new UserEntity();

        userEntity.setEmail(userDTO.getEmail());
        userEntity.setIdUser(userDTO.getIdUser());
        userEntity.setName(userDTO.getName());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setUsername(userDTO.getUsername());

        return userEntity;
    }

    @Override
    public UserDTO DTOToEntity(UserEntity userEntity){

        UserDTO userDTO = new UserDTO();

        userDTO.setEmail(userEntity.getEmail());
        userDTO.setIdUser(userEntity.getIdUser());
        userDTO.setName(userEntity.getName());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setUsername(userEntity.getUsername());

        return userDTO;
    }
}