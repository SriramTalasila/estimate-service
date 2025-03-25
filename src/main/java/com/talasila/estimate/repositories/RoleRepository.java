package com.talasila.estimate.repositories;

import com.talasila.estimate.repositories.entity.TRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<TRole,Long> {
}
