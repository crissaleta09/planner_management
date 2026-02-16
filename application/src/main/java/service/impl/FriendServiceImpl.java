package service.impl;

import exception.ProductNotFoundException;
import model.Friend;
import org.springframework.stereotype.Service;
import port.FriendRepositoryPort;
import service.FriendService;

import java.util.Set;

@Service
public class FriendServiceImpl implements FriendService {
    private final FriendRepositoryPort friendRepositoryPort;

    public FriendServiceImpl(FriendRepositoryPort friendRepositoryPort, FriendRepositoryPort friendRepositoryPort1) {
        this.friendRepositoryPort = friendRepositoryPort1;
    }
    @Override
    public Set<Friend> findAll() {
        return friendRepositoryPort.findAll().orElseThrow(() -> new ProductNotFoundException("FriendService.findAll"));
    }
}
