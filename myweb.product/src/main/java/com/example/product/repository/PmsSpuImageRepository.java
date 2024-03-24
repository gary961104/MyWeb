package com.example.product.repository;

import com.example.product.entity.PmsSpuImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PmsSpuImageRepository extends JpaRepository<PmsSpuImage, Long>, JpaSpecificationExecutor<PmsSpuImage> {
}