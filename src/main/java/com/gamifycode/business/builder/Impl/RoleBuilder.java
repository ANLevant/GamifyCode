package com.gamifycode.business.builder.Impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.RoleDTO;
import com.gamifycode.persistence.model.RoleEntity;
import org.springframework.stereotype.Component;

@Component
public class RoleBuilder implements EntityDTOBuilder<RoleEntity, RoleDTO> {

    @Override
    public RoleEntity entityToDTO(RoleDTO roleDTO){
        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setIdRole(roleDTO.getIdRole());
        roleEntity.setRoleName(roleDTO.getRoleName());

        return roleEntity;
    }

    @Override
    public RoleDTO DTOToEntity(RoleEntity roleEntity){
        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setIdRole(roleEntity.getIdRole());
        roleDTO.setRoleName(roleEntity.getRoleName());

        return roleDTO;
    }
}