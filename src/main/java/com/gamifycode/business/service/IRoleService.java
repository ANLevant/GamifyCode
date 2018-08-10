package com.gamifycode.business.service;

import com.gamifycode.business.dto.RoleDTO;
import com.gamifycode.business.dto.UserDTO;

public interface IRoleService {
    RoleDTO getUserRole(UserDTO userToQueryRoleDTO);
}
