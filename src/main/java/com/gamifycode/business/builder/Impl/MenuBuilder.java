package com.gamifycode.business.builder.Impl;

import com.gamifycode.business.builder.EntityDTOBuilder;
import com.gamifycode.business.dto.MenuDTO;
import com.gamifycode.persistence.model.MenuEntity;
import org.springframework.stereotype.Component;

@Component
public class MenuBuilder extends EntityDTOBuilder<MenuEntity, MenuDTO> {
    
    @Override
    public MenuEntity dtoToEntity(MenuDTO MenuDTO) {

        MenuEntity MenuEntity = new MenuEntity();

        MenuEntity.setId(MenuDTO.getId());
        MenuEntity.setText(MenuDTO.getText());
        MenuEntity.setLink(MenuDTO.getLink());
        MenuEntity.setIcon(MenuDTO.getIcon());
        MenuEntity.setIdRoleRestriction(MenuDTO.getIdRoleRestriction().toString());

        return MenuEntity;
    }

    @Override
    public MenuDTO entityToDTO(MenuEntity MenuEntity) {

        MenuDTO MenuDTO = new MenuDTO();

        MenuDTO.setId(MenuEntity.getId());
        MenuDTO.setText(MenuEntity.getText());
        MenuDTO.setLink(MenuEntity.getLink());
        MenuDTO.setIcon(MenuEntity.getIcon());

        String[] stringRoles = MenuEntity.getIdRoleRestriction().replace("{", "").replace("}", "").split(",");
        Integer[] roles = new Integer[stringRoles.length];

        for(int i = 0; i < stringRoles.length; i++){
            roles[i] = Integer.parseInt(stringRoles[i]);
        }

        MenuDTO.setIdRoleRestriction(roles);

        return MenuDTO;
    }
}
