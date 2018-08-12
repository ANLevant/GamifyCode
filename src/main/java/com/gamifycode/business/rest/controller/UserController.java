package com.gamifycode.business.rest.controller;

import com.gamifycode.business.dto.RoleDTO;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.business.exception.LoginException;
import com.gamifycode.business.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody UserDTO userToCreateDTO) {
        userService.createUser(userToCreateDTO);
    }

    @RequestMapping(path = "/{username}/login", method = RequestMethod.PUT)
    public UserDTO logUser(@PathVariable String username, UserDTO userToLogDTO) throws LoginException {
        userToLogDTO.setUsername(username);

        return userService.logUser(userToLogDTO);
    }

    @RequestMapping(path="/{userId}", method = RequestMethod.GET)
    public UserDTO userDetails(@PathVariable int userId){
        UserDTO userToSearchDTO = new UserDTO();
        userToSearchDTO.setIdUser(userId);

        return userService.getUserById(userToSearchDTO);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserDTO> getAllUsersList() {
        return userService.getAllUsersList();
    }

    @RequestMapping(path="role/{roleId}", method = RequestMethod.GET)
    public List<UserDTO> getUserListByRoleType(@PathVariable int roleId){
        RoleDTO roleToSearchDTO = new RoleDTO();
        roleToSearchDTO.setIdRole(roleId);

        return userService.getUserListByRoleType(roleToSearchDTO);
    }
}
