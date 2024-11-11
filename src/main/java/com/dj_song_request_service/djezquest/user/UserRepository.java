package com.dj_song_request_service.djezquest.user;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Optional: Add custom query methods if you need to find users by specific fields
    Optional<User> findByEmail(String email);
    Optional<User> findByUserName(String userName);
}