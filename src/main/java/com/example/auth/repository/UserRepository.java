package com.example.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.auth.model.User;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    // User findByMemberId(String memberId);

    User findByUsername(String username);

}
