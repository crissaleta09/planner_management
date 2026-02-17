package com.plannermanagement.infrastructure.adapter;

import com.plannermanagement.infrastructure.entity.FriendEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface FriendJpaRepository extends JpaRepository<FriendEntity, Long>, JpaSpecificationExecutor<FriendEntity> {

    /**
     * Se debe especificar la consulta JPQL para obtener todos los amigos, ya que el método
     * findAll() de JpaRepository devuelve una List y se necesita un Set,
     * @return
     */
    @Query("SELECT f FROM FriendEntity f")
    Set<FriendEntity> findAllFriends();
}
