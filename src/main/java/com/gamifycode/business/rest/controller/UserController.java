package com.gamifycode.business.rest.controller;

import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.business.exception.LogException;
import com.gamifycode.business.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public UserDTO logUser(@PathVariable String username, UserDTO userToLogDTO) throws LogException {
        userToLogDTO.setUsername(username);

        return userService.logUser(userToLogDTO);
    }
}
