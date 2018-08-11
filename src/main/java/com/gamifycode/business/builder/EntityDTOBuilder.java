package com.gamifycode.business.builder;

import java.util.List;

public interface EntityDTOBuilder <T, S> {
    T dtoToEntity(S dto);
    S entityToDTO(T entity);
    List<T> dtoListToEntityList(List<S> dtoList);
    List<S> entityListToDTOList(List<T> entityList);
}
