package com.example.coupon.repository;

import com.example.coupon.entity.SmsSeckillSkuRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsSeckillSkuRelationRepository extends JpaRepository<SmsSeckillSkuRelation, Long>, JpaSpecificationExecutor<SmsSeckillSkuRelation> {
}