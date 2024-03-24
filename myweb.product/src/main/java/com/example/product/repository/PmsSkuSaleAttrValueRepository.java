package com.example.product.repository;

import com.example.product.entity.PmsSkuSaleAttrValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsSkuSaleAttrValueRepository extends JpaRepository<PmsSkuSaleAttrValue, Long>, JpaSpecificationExecutor<PmsSkuSaleAttrValue> {
}