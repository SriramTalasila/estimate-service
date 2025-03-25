package com.talasila.estimate.repositories;

import com.talasila.estimate.repositories.entity.TCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<TCustomer, Long> {
}
