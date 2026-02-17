package com.plannermanagement.infrastructure.repository;

import com.plannermanagement.domain.criteria.FriendCriteria;
import com.plannermanagement.infrastructure.adapter.FriendJpaRepository;
import com.plannermanagement.infrastructure.entity.FriendEntity;
import com.plannermanagement.infrastructure.spec.FriendSpecification;
import com.plannermanagement.domain.exception.MappingNotSuccededException;
import com.plannermanagement.infrastructure.mapper.FriendMapper;
import com.plannermanagement.domain.model.Friend;
import org.springframework.stereotype.Repository;
import com.plannermanagement.domain.port.FriendRepositoryPort;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public class FriendRepositoryImpl implements FriendRepositoryPort {

    FriendJpaRepository friendJpaRepository;
    FriendMapper friendMapper;
    public FriendRepositoryImpl(FriendJpaRepository friendJpaRepository, FriendMapper friendMapper) {
        this.friendJpaRepository = friendJpaRepository;
        this.friendMapper = friendMapper;
    }

    @Override
    public Optional<Set<Friend>> findAll() {
        var allFriends = friendJpaRepository.findAllFriends();
        if (allFriends.isEmpty()) {
            return Optional.empty();
        }
        var allFriendsMap = FriendMapper.INSTANCE.toDomain(allFriends);
        return Optional.of(Optional.of(allFriendsMap).orElseThrow(() -> new MappingNotSuccededException("FriendRepository.FindAll")));
    }

    @Override
    public Set<Friend> searchByCriteria(FriendCriteria criteria) {
        var spec = FriendSpecification.from(criteria); //creamos la especificación a partir de los criterios, esto nos devuelve un objeto Specification<FriendEntity> que se puede usar para filtrar los resultados en la base de datos
        List<FriendEntity> friends = friendJpaRepository.findAll(spec);
        if (friends.isEmpty()) {
            return Set.of();
        }
        return FriendMapper.INSTANCE.toDomain((Set.copyOf(friends))); //SET.copyOf(friends) es necesario para convertir la lista de FriendEntity a un Set de FriendEntit.
    }
}
