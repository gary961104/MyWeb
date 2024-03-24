package com.example.coupon.repository;

import com.example.coupon.entity.SmsSpuBound;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsSpuBoundRepository extends JpaRepository<SmsSpuBound, Long>, JpaSpecificationExecutor<SmsSpuBound> {
}