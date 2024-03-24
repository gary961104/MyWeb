package com.example.member.repository;

import com.example.member.entity.UmsMemberStatisticsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsMemberStatisticsInfoRepository extends JpaRepository<UmsMemberStatisticsInfo, Long>, JpaSpecificationExecutor<UmsMemberStatisticsInfo> {
}