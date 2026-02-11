package com.plannermanagement.controller;

import model.Friend;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plannermanagement.service.FriendService;

import java.util.Set;

@RestController
public class FriendRestController extends RestControllerBase {
    private final FriendService friendService;
    public FriendRestController(FriendService friendService) {
        this.friendService = friendService;
    }

    @GetMapping("/friends")
    public ResponseEntity<Set<Friend>> getFriends() {
        Set<Friend> friends = friendService.findAll();
        return  ResponseEntity.ok(friends);
    }
}
