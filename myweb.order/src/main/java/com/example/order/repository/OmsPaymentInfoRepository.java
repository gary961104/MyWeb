package com.example.order.repository;

import com.example.order.entity.OmsPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OmsPaymentInfoRepository extends JpaRepository<OmsPaymentInfo, Long>, JpaSpecificationExecutor<OmsPaymentInfo> {
}