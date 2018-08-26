package com.gamifycode.business.service.impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.MenuDTO;
import com.gamifycode.business.dto.UserDTO;
import com.gamifycode.business.service.IMenuService;
import com.gamifycode.persistence.model.MenuEntity;
import com.gamifycode.persistence.model.UserEntity;
import com.gamifycode.persistence.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private EntityDTOBuilder<MenuEntity, MenuDTO> menuBuilder;

    @Override
    public List<MenuDTO> getMenu(UserDTO userDTO) {
        List<MenuEntity> menu = menuRepository.getMenuItemsByRole(userDTO.getRoleId());
        return  menuBuilder.entityListToDTOList(menu);
    }

    @Override
    public void createMenuItem(MenuDTO menuDTO) {
        menuRepository.save(menuBuilder.dtoToEntity(menuDTO));
    }
}
