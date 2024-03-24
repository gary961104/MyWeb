package com.example.coupon.repository;

import com.example.coupon.entity.SmsSkuLadder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsSkuLadderRepository extends JpaRepository<SmsSkuLadder, Long>, JpaSpecificationExecutor<SmsSkuLadder> {
}