package com.example.product.repository;

import com.example.product.entity.PmsSkuInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsSkuInfoRepository extends JpaRepository<PmsSkuInfo, Long>, JpaSpecificationExecutor<PmsSkuInfo> {
}