package com.example.member.repository;

import com.example.member.entity.UmsMemberLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsMemberLevelRepository extends JpaRepository<UmsMemberLevel, Long>, JpaSpecificationExecutor<UmsMemberLevel> {
}