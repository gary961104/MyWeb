package com.example.coupon.repository;

import com.example.coupon.entity.SmsSeckillSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsSeckillSessionRepository extends JpaRepository<SmsSeckillSession, Long>, JpaSpecificationExecutor<SmsSeckillSession> {
}