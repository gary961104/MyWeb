package com.example.member.repository;

import com.example.member.entity.UmsIntegrationChangeHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsIntegrationChangeHistoryRepository extends JpaRepository<UmsIntegrationChangeHistory, Long>, JpaSpecificationExecutor<UmsIntegrationChangeHistory> {
}