package com.plannermanagement.service;

import com.plannermanagement.domain.criteria.FriendCriteria;
import com.plannermanagement.domain.model.Friend;

import java.util.Set;

public abstract interface FriendService {
    Set<Friend> findAll();
    Set<Friend> searchByCriteria(FriendCriteria criteria);
}
