package com.plannermanagement.infrastructure.mapper;

import com.plannermanagement.infrastructure.entity.FriendEntity;
import com.plannermanagement.domain.model.Friend;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface FriendMapper {
    FriendMapper INSTANCE = Mappers.getMapper(FriendMapper.class);

    //Si hubieran nombres de campos diferentes entre Friend y FriendEntity, se podrían usar anotaciones @Mapping para mapearlos correctamente.
    // Por ejemplo:
    // @Mapping(source = "friendName", target = "name")
    //siendo friendName el campo en FriendEntity y name el campo en Friend.
    Friend toDomain(FriendEntity friendEntity);
    Set<Friend> toDomain(Set<FriendEntity> friendEntities);

    FriendEntity toEntity(Friend friend);
}
