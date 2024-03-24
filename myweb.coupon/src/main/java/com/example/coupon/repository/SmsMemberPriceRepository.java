package com.example.coupon.repository;

import com.example.coupon.entity.SmsMemberPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsMemberPriceRepository extends JpaRepository<SmsMemberPrice, Long>, JpaSpecificationExecutor<SmsMemberPrice> {
}