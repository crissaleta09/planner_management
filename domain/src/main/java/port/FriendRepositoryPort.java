package port;

import model.Friend;

import java.util.Optional;
import java.util.Set;

public interface FriendRepositoryPort {
    Optional<Set<Friend>> findAll();
}
