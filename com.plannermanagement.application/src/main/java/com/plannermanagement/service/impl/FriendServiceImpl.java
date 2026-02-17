package com.plannermanagement.service.impl;

import com.plannermanagement.domain.criteria.FriendCriteria;
import com.plannermanagement.domain.exception.ProductNotFoundException;
import com.plannermanagement.domain.model.Friend;
import org.springframework.stereotype.Service;
import com.plannermanagement.domain.port.FriendRepositoryPort;
import com.plannermanagement.service.FriendService;

import java.util.Set;

@Service
public class FriendServiceImpl implements FriendService {
    private final FriendRepositoryPort friendRepositoryPort;

    public FriendServiceImpl(FriendRepositoryPort friendRepositoryPort, FriendRepositoryPort friendRepositoryPort1) {
        this.friendRepositoryPort = friendRepositoryPort1;
    }
    @Override
    public Set<Friend> findAll() {
        return friendRepositoryPort.findAll().orElseThrow(() -> new ProductNotFoundException("FriendService.findAll")); //No es recomendable lanzar una excepción cuando no se encuentra nada, lo ideal sería devolver un Set vacío, pero se hace para el ejemplo
    }

    @Override
    public Set<Friend> searchByCriteria(FriendCriteria criteria) {
        return friendRepositoryPort.searchByCriteria(criteria);
    }
}
