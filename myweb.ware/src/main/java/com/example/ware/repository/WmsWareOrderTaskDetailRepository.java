package com.example.ware.repository;

import com.example.ware.entity.WmsWareOrderTaskDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WmsWareOrderTaskDetailRepository extends JpaRepository<WmsWareOrderTaskDetail, Long>, JpaSpecificationExecutor<WmsWareOrderTaskDetail> {
}