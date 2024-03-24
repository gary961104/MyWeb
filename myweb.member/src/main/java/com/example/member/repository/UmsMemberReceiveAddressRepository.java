package com.example.member.repository;

import com.example.member.entity.UmsMemberReceiveAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsMemberReceiveAddressRepository extends JpaRepository<UmsMemberReceiveAddress, Long>, JpaSpecificationExecutor<UmsMemberReceiveAddress> {
}