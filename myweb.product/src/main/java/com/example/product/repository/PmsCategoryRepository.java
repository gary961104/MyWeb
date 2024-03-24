package com.example.product.repository;

import com.example.product.entity.PmsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsCategoryRepository extends JpaRepository<PmsCategory, Long>, JpaSpecificationExecutor<PmsCategory> {
}