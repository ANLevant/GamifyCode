package com.gamifycode.business.builder.Impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.RoleDTO;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.persistence.model.RoleEntity;
import com.gamifycode.persistence.model.UserEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoleBuilder implements EntityDTOBuilder<RoleEntity, RoleDTO> {

    @Override
    public RoleEntity dtoToEntity(RoleDTO roleDTO){
        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setIdRole(roleDTO.getIdRole());
        roleEntity.setRoleName(roleDTO.getRoleName());

        return roleEntity;
    }

    @Override
    public RoleDTO entityToDTO(RoleEntity roleEntity){
        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setIdRole(roleEntity.getIdRole());
        roleDTO.setRoleName(roleEntity.getRoleName());

        return roleDTO;
    }

    @Override
    public List<RoleEntity> dtoListToEntityList(List<RoleDTO> roleDTOList) {
        return null;
    }

    @Override
    public List<RoleDTO> entityListToDTOList(List<RoleEntity> roleEntityList) {
        List<RoleDTO> roleDTOs = new ArrayList<>();

        for(RoleEntity postEntity : roleEntityList){
            roleDTOs.add(this.entityToDTO(postEntity));
        }

        return roleDTOs;
    }
}