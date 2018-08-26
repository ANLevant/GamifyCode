package com.gamifycode.persistence.repository;

import com.gamifycode.persistence.model.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {

    @Query(value = "SELECT * FROM gamifycode.menu m WHERE ?1 = ANY (m.id_role_restriction_menu_item);", nativeQuery = true)
    List<MenuEntity> getMenuItemsByRole(int roleID);
}
