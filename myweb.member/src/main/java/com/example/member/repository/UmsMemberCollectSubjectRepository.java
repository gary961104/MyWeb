package com.example.member.repository;

import com.example.member.entity.UmsMemberCollectSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsMemberCollectSubjectRepository extends JpaRepository<UmsMemberCollectSubject, Long>, JpaSpecificationExecutor<UmsMemberCollectSubject> {
}