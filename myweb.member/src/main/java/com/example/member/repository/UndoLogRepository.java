package com.example.member.repository;

import com.example.member.entity.UndoLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UndoLogRepository extends JpaRepository<UndoLog, Long>, JpaSpecificationExecutor<UndoLog> {
}