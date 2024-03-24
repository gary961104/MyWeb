package com.example.order.repository;

import com.example.order.entity.OmsRefundInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OmsRefundInfoRepository extends JpaRepository<OmsRefundInfo, Long>, JpaSpecificationExecutor<OmsRefundInfo> {
}