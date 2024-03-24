package com.exampleware.repository;

import com.exampleware.entity.WmsWareInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WmsWareInfoRepository extends JpaRepository<WmsWareInfo, Long>, JpaSpecificationExecutor<WmsWareInfo> {
}