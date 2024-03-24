package com.example.coupon.repository;

import com.example.coupon.entity.SmsSeckillPromotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsSeckillPromotionRepository extends JpaRepository<SmsSeckillPromotion, Long>, JpaSpecificationExecutor<SmsSeckillPromotion> {
}