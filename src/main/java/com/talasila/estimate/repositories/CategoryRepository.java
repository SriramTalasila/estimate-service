package com.talasila.estimate.repositories;

import com.talasila.estimate.repositories.entity.TCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<TCategory, Long> {
}
