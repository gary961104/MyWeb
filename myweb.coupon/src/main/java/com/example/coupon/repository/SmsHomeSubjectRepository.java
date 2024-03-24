package com.example.coupon.repository;

import com.example.coupon.entity.SmsHomeSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsHomeSubjectRepository extends JpaRepository<SmsHomeSubject, Long>, JpaSpecificationExecutor<SmsHomeSubject> {
}