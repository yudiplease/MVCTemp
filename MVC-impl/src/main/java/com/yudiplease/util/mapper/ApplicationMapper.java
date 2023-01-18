package com.yudiplease.util.mapper;

import com.yudiplease.model.ApplicationEntity;
import dto.response.ApplicationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {

    @Mapping(target = "name", defaultExpression = "java(entity.getName().toUpperCase())")
    ApplicationResponse toResponse(ApplicationEntity entity);

    List<ApplicationResponse> toResponse(List<ApplicationEntity> entity);
}
