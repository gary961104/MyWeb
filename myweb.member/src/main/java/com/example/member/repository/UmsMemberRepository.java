package com.example.member.repository;

import com.example.member.entity.UmsMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsMemberRepository extends JpaRepository<UmsMember, Long>, JpaSpecificationExecutor<UmsMember> {
}