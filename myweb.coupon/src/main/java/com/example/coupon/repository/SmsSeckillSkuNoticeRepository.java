package com.example.coupon.repository;

import com.example.coupon.entity.SmsSeckillSkuNotice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsSeckillSkuNoticeRepository extends JpaRepository<SmsSeckillSkuNotice, Long>, JpaSpecificationExecutor<SmsSeckillSkuNotice> {
}