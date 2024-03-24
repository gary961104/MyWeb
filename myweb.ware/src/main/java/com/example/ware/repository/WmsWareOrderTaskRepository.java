package com.example.ware.repository;

import com.example.ware.entity.WmsWareOrderTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface WmsWareOrderTaskRepository extends JpaRepository<WmsWareOrderTask, Long>, JpaSpecificationExecutor<WmsWareOrderTask> {
}