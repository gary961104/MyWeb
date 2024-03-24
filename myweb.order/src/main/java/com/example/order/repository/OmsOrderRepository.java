package com.example.order.repository;

import com.example.order.entity.OmsOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OmsOrderRepository extends JpaRepository<OmsOrder, Long>, JpaSpecificationExecutor<OmsOrder> {
}