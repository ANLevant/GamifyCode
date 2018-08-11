package com.gamifycode.business.service.impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.RoleDTO;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.business.exception.LoginException;
import com.gamifycode.business.service.IUserService;
import com.gamifycode.persistence.model.UserEntity;
import com.gamifycode.persistence.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EntityDTOBuilder<UserEntity, UserDTO> builder;

    @Override
    public void createUser(UserDTO userToCreateDTO) {
        UserEntity userToCreate = builder.dtoToEntity(userToCreateDTO);
        userRepository.save(userToCreate);
    }

    @Override
    public UserDTO logUser(UserDTO userToLogDTO) throws LoginException {
        UserEntity foundUser =  userRepository.findByUsername(userToLogDTO.getUsername());

        if(foundUser.getPassword() == userToLogDTO.getPassword() && foundUser != null){
            return builder.entityToDTO(foundUser);
        }
        else{
            throw new LoginException();
        }
    }

    @Override
    public UserDTO getUserById(UserDTO userToSearchDTO) {

        UserEntity foundUser = userRepository.findById(userToSearchDTO.getIdUser()).get();
        return builder.entityToDTO(foundUser);
    }

    @Override
    public List<UserDTO> getUserListByRoleType(RoleDTO roleToSearchDTO) {
        //TODO: Refactor to implement actual database query
        return builder.entityListToDTOList(userRepository.findAll());
    }
}
