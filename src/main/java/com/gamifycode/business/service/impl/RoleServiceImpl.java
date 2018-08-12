package com.gamifycode.business.service.impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.RoleDTO;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.business.service.IRoleService;
import com.gamifycode.persistence.model.RoleEntity;
import com.gamifycode.persistence.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private EntityDTOBuilder<RoleEntity, RoleDTO> builder;

    @Override
    public RoleDTO getUserRole(UserDTO userToQueryRoleDTO) {
        RoleEntity roleFound = roleRepository.getOne(userToQueryRoleDTO.getRoleId());

        return builder.entityToDTO(roleFound);
    }

    @Override
    public List<RoleDTO> getAllRoles() {
        return builder.entityListToDTOList(roleRepository.findAll());
    }
}
