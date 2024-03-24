package com.example.product.repository;

import com.example.product.entity.PmsBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsBrandRepository extends JpaRepository<PmsBrand, Long>, JpaSpecificationExecutor<PmsBrand> {
}