package com.talasila.estimate.repositories;

import com.talasila.estimate.repositories.entity.TProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<TProduct, Long> {
}
