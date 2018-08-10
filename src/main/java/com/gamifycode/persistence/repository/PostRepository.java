package com.gamifycode.persistence.repository;

import com.gamifycode.persistence.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<PostEntity, Integer> {
}
