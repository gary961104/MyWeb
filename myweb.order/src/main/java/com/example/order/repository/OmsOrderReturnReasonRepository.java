package com.example.order.repository;

import com.example.order.entity.OmsOrderReturnReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OmsOrderReturnReasonRepository extends JpaRepository<OmsOrderReturnReason, Long>, JpaSpecificationExecutor<OmsOrderReturnReason> {
}