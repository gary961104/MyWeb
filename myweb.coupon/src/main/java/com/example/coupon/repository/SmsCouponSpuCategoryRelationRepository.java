package com.example.coupon.repository;

import com.example.coupon.entity.SmsCouponSpuCategoryRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsCouponSpuCategoryRelationRepository extends JpaRepository<SmsCouponSpuCategoryRelation, Long>, JpaSpecificationExecutor<SmsCouponSpuCategoryRelation> {
}