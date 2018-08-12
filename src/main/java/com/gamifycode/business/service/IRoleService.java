package com.gamifycode.business.service;

import com.gamifycode.business.dto.RoleDTO;
import com.gamifycode.business.dto.UserDTO;

import java.util.List;

public interface IRoleService {
    RoleDTO getUserRole(UserDTO userToQueryRoleDTO);
    List<RoleDTO> getAllRoles();
}
