package com.gamifycode.business.builder;

public interface EntityDTOBuilder <T, S> {
    T entityToDTO(S DTO);
    S DTOToEntity(T entity);
}
