package com.example.coupon.repository;

import com.example.coupon.entity.SmsCouponSpuRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsCouponSpuRelationRepository extends JpaRepository<SmsCouponSpuRelation, Long>, JpaSpecificationExecutor<SmsCouponSpuRelation> {
}