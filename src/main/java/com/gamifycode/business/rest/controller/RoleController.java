package com.gamifycode.business.rest.controller;

import com.gamifycode.business.dto.RoleDTO;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.business.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @RequestMapping(path = "/user/{roleId}", method = RequestMethod.GET)
    public RoleDTO getUserRole(@PathVariable int roleId) {
        UserDTO userWithRoleToGet = new UserDTO();

        userWithRoleToGet.setRoleId(roleId);

        return roleService.getUserRole(userWithRoleToGet);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<RoleDTO> getAllRoles() {
        return roleService.getAllRoles();
    }
}
