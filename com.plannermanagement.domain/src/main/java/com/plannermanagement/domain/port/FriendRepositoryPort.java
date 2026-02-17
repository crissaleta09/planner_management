package com.plannermanagement.domain.port;

import com.plannermanagement.domain.criteria.FriendCriteria;
import com.plannermanagement.domain.model.Friend;

import java.util.Optional;
import java.util.Set;

public interface FriendRepositoryPort {
    Optional<Set<Friend>> findAll(); //No es recomendable devolver un Optional de un Set, pero se hace para el ejemplo, lo ideal sería devolver un Set vacío en caso de no encontrar nada
    Set<Friend> searchByCriteria(FriendCriteria criteria); //No se usa optional porque se asume que si no se encuentra nada, se devuelve un Set vacío
}
