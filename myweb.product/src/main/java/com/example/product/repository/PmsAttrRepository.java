package com.example.product.repository;

import com.example.product.entity.PmsAttr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsAttrRepository extends JpaRepository<PmsAttr, Long>, JpaSpecificationExecutor<PmsAttr> {
}