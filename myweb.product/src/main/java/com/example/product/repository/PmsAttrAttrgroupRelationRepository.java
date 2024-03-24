package com.example.product.repository;

import com.example.product.entity.PmsAttrAttrgroupRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsAttrAttrgroupRelationRepository extends JpaRepository<PmsAttrAttrgroupRelation, Long>, JpaSpecificationExecutor<PmsAttrAttrgroupRelation> {
}