package com.talasila.estimate.repositories;

import com.talasila.estimate.repositories.entity.TEstimate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstimateRepository extends JpaRepository<TEstimate, Long> {
}
