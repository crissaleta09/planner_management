package com.pannermanagement.PlannerManagement.infrastructure.repository;

import com.pannermanagement.PlannerManagement.infrastructure.entity.FriendEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendJpaRepository extends JpaRepository<FriendEntity, Long> {
}
