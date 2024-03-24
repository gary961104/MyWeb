package com.example.coupon.repository;

import com.example.coupon.entity.SmsSkuFullReduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsSkuFullReductionRepository extends JpaRepository<SmsSkuFullReduction, Long>, JpaSpecificationExecutor<SmsSkuFullReduction> {
}