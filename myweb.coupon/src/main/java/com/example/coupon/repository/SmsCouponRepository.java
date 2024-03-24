package com.example.coupon.repository;

import com.example.coupon.entity.SmsCoupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsCouponRepository extends JpaRepository<SmsCoupon, Long>, JpaSpecificationExecutor<SmsCoupon> {
}