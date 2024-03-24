package com.example.coupon.repository;

import com.example.coupon.entity.SmsHomeSubjectSpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsHomeSubjectSpuRepository extends JpaRepository<SmsHomeSubjectSpu, Long>, JpaSpecificationExecutor<SmsHomeSubjectSpu> {
}