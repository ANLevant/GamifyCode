package com.gamifycode.business.service;

import com.gamifycode.business.dto.RoleDTO;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.business.exception.LoginException;

import java.util.List;

public interface IUserService {

    void createUser(UserDTO userToCreateDTO);
    UserDTO logUser(UserDTO userToLogDTO) throws LoginException;
    UserDTO getUserById(UserDTO userToSearchDTO);
    List<UserDTO> getUserListByRoleType(RoleDTO roleToSearchDTO);
    List<UserDTO> getAllUsersList();
}
