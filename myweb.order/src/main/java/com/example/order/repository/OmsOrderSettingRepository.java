package com.example.order.repository;

import com.example.order.entity.OmsOrderSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OmsOrderSettingRepository extends JpaRepository<OmsOrderSetting, Long>, JpaSpecificationExecutor<OmsOrderSetting> {
}