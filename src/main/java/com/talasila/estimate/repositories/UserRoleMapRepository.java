package com.talasila.estimate.repositories;

import com.talasila.estimate.repositories.entity.TUserRoleMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleMapRepository extends JpaRepository<TUserRoleMap,Long> {
}
