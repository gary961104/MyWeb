package com.exampleware.repository;

import com.exampleware.entity.WmsPurchaseDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WmsPurchaseDetailRepository extends JpaRepository<WmsPurchaseDetail, Long>, JpaSpecificationExecutor<WmsPurchaseDetail> {
}