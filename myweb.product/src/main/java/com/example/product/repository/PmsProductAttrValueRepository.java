package com.example.product.repository;

import com.example.product.entity.PmsProductAttrValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsProductAttrValueRepository extends JpaRepository<PmsProductAttrValue, Long>, JpaSpecificationExecutor<PmsProductAttrValue> {
}