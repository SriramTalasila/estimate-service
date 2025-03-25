package com.talasila.estimate.repositories;

import com.talasila.estimate.repositories.entity.TCategoryDiscount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDiscountRepository extends JpaRepository<TCategoryDiscount, Long> {
}
