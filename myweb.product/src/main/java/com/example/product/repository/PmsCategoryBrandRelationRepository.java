package com.example.product.repository;

import com.example.product.entity.PmsCategoryBrandRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsCategoryBrandRelationRepository extends JpaRepository<PmsCategoryBrandRelation, Long>, JpaSpecificationExecutor<PmsCategoryBrandRelation> {
}