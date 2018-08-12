package com.gamifycode.persistence.repository;

import com.gamifycode.persistence.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);

    @Query("SELECT u FROM UserEntity  u WHERE u.idRole = ?1")
    List<UserEntity> findByRole(int roleId);
}
