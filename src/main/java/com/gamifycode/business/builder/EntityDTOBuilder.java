package com.gamifycode.business.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class EntityDTOBuilder <T, S> {
    public abstract T dtoToEntity(S dto);

    public abstract S entityToDTO(T entity);

    public List<T> dtoListToEntityList(List<S> dtoList){
        List<T> entitiesList = new ArrayList<>();

        for(S dto : dtoList){
            entitiesList.add(this.dtoToEntity(dto));
        }

        return entitiesList;
    }

    public List<S> entityListToDTOList(List<T> entityList){
        List<S> dtoList = new ArrayList<>();

        for(T entity : entityList){
            dtoList.add(this.entityToDTO(entity));
        }

        return dtoList;
    }
}
