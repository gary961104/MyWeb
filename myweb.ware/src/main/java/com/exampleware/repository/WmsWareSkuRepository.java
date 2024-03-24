package com.exampleware.repository;

import com.exampleware.entity.WmsWareSku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WmsWareSkuRepository extends JpaRepository<WmsWareSku, Long>, JpaSpecificationExecutor<WmsWareSku> {
}