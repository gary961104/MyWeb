package com.example.backend2.repository;

import com.example.backend2.model.UserModel;
import org.h2.engine.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
/** 繼承JAP
 * JpaRepository<model,此model的ID類型>
 * JpaSpecificationExecutor<model>
 */
public interface UserRepository extends JpaRepository<UserModel,Integer>, JpaSpecificationExecutor<UserModel> {

}
