package com.example.product.repository;

import com.example.product.entity.PmsSpuInfoDesc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsSpuInfoDescRepository extends JpaRepository<PmsSpuInfoDesc, Long>, JpaSpecificationExecutor<PmsSpuInfoDesc> {
}