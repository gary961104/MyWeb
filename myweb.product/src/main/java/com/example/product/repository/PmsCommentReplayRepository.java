package com.example.product.repository;

import com.example.product.entity.PmsCommentReplay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsCommentReplayRepository extends JpaRepository<PmsCommentReplay, Long>, JpaSpecificationExecutor<PmsCommentReplay> {
}