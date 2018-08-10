package com.gamifycode.business.service.impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.business.exception.LogException;
import com.gamifycode.business.service.IUserService;
import com.gamifycode.persistence.model.UserEntity;
import com.gamifycode.persistence.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EntityDTOBuilder<UserEntity, UserDTO> builder;

    @Override
    public void createUser(UserDTO userToCreateDTO) {
        UserEntity userToCreate = builder.entityToDTO(userToCreateDTO);
        userRepository.save(userToCreate);
    }

    @Override
    public UserDTO logUser(UserDTO userToLogDTO) throws LogException {
        UserEntity foundUser =  userRepository.findByUsername(userToLogDTO.getUsername());

        if(foundUser.getPassword() == userToLogDTO.getPassword() && foundUser != null){
            return builder.DTOToEntity(foundUser);
        }
        else{
            throw new LogException();
        }
    }
}
