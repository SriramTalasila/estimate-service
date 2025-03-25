package com.talasila.estimate.repositories;

import com.talasila.estimate.repositories.entity.TBusiness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends JpaRepository<TBusiness, Long> {
}
