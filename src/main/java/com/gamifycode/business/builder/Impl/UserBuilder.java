package com.gamifycode.business.builder.Impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.persistence.model.UserEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserBuilder implements EntityDTOBuilder<UserEntity, UserDTO> {

    @Override
    public UserEntity dtoToEntity(UserDTO userDTO){

        UserEntity userEntity = new UserEntity();

        userEntity.setEmail(userDTO.getEmail());
        userEntity.setIdUser(userDTO.getIdUser());
        userEntity.setName(userDTO.getName());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setIdRole(userDTO.getRoleId());

        return userEntity;
    }

    @Override
    public UserDTO entityToDTO(UserEntity userEntity){

        UserDTO userDTO = new UserDTO();

        userDTO.setEmail(userEntity.getEmail());
        userDTO.setIdUser(userEntity.getIdUser());
        userDTO.setName(userEntity.getName());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setUsername(userEntity.getUsername());
        userDTO.setRoleId(userEntity.getIdRole());

        return userDTO;
    }

    @Override
    public List<UserEntity> dtoListToEntityList(List<UserDTO> UserDTOList) {
        List<UserEntity> userEntities = new ArrayList<>();

        for(UserDTO userDTO : UserDTOList){
            userEntities.add(this.dtoToEntity(userDTO));
        }

        return userEntities;
    }

    @Override
    public List<UserDTO> entityListToDTOList(List<UserEntity> userEntityList) {
        List<UserDTO> userDTOs = new ArrayList<>();

        for(UserEntity postEntity : userEntityList){
            userDTOs.add(this.entityToDTO(postEntity));
        }

        return userDTOs;
    }
}