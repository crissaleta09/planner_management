package com.plannermanagement.repository;

import com.plannermanagement.adapter.FriendJpaRepository;
import exception.MappingNotSuccededException;
import com.plannermanagement.mapper.FriendMapper;
import model.Friend;
import org.springframework.stereotype.Repository;
import port.FriendRepositoryPort;

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
}
