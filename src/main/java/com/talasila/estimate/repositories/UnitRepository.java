package com.talasila.estimate.repositories;

import com.talasila.estimate.repositories.entity.TUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<TUnit, Long> {
}
