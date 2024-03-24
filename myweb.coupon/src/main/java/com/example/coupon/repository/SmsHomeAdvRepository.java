package com.example.coupon.repository;

import com.example.coupon.entity.SmsHomeAdv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsHomeAdvRepository extends JpaRepository<SmsHomeAdv, Long>, JpaSpecificationExecutor<SmsHomeAdv> {
}