package com.talasila.estimate.repositories;

import com.talasila.estimate.repositories.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<TUser, Long> {

    Optional<TUser> findByEmail(String email);
}

