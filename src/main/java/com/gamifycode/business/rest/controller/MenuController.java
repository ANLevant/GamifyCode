package com.gamifycode.business.rest.controller;

import com.gamifycode.business.dto.MenuDTO;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.business.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/menu")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @RequestMapping(path = "/{roleId}",method = RequestMethod.GET)
    public List<MenuDTO> getMenu(@PathVariable int roleId){
        UserDTO userDTO = new UserDTO();
        userDTO.setRoleId(roleId);
        return menuService.getMenu(userDTO);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void createMenuItem(MenuDTO menuDTO){
        menuService.createMenuItem(menuDTO);
    }
}
