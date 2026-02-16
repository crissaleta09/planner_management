package com.plannermanagement.adapter;

import com.plannermanagement.entity.FriendEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface FriendJpaRepository extends JpaRepository<FriendEntity, Long> {

    @Query("SELECT f FROM FriendEntity f")
    Set<FriendEntity> findAllFriends();
}
