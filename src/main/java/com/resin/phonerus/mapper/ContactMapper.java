package com.resin.phonerus.mapper;

import com.resin.phonerus.dto.ContactDto;
import com.resin.phonerus.entity.ContactEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContactMapper {

    ContactDto entityToDto(ContactEntity entity);

    ContactEntity dtoToEntity(ContactDto dto);

}
