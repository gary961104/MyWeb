package com.example.member.repository;

import com.example.member.entity.UmsGrowthChangeHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsGrowthChangeHistoryRepository extends JpaRepository<UmsGrowthChangeHistory, Long>, JpaSpecificationExecutor<UmsGrowthChangeHistory> {
}