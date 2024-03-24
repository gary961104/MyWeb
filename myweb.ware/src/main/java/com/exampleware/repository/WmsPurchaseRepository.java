package com.exampleware.repository;

import com.exampleware.entity.WmsPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WmsPurchaseRepository extends JpaRepository<WmsPurchase, Long>, JpaSpecificationExecutor<WmsPurchase> {
}