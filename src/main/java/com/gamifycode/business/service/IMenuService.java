package com.gamifycode.business.service;

import com.gamifycode.business.dto.MenuDTO;
import com.gamifycode.business.dto.UserDTO;

import java.util.List;

public interface IMenuService {
    List<MenuDTO> getMenu(UserDTO userDTO);
    void createMenuItem(MenuDTO menuDTO);
}