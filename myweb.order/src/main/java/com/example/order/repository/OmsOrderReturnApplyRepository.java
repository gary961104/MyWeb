package com.example.order.repository;

import com.example.order.entity.OmsOrderReturnApply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OmsOrderReturnApplyRepository extends JpaRepository<OmsOrderReturnApply, Long>, JpaSpecificationExecutor<OmsOrderReturnApply> {
}