package com.example.member.repository;

import com.example.member.entity.UmsMemberCollectSpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsMemberCollectSpuRepository extends JpaRepository<UmsMemberCollectSpu, Long>, JpaSpecificationExecutor<UmsMemberCollectSpu> {
}