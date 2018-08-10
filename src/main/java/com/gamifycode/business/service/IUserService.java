package com.gamifycode.business.service;

import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.business.exception.LogException;

public interface IUserService {

    void createUser(UserDTO userToCreateDTO);
    UserDTO logUser(UserDTO userToLogDTO) throws LogException;
}
