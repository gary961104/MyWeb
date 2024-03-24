package com.example.product.repository;

import com.example.product.entity.PmsSpuComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsSpuCommentRepository extends JpaRepository<PmsSpuComment, Long>, JpaSpecificationExecutor<PmsSpuComment> {
}