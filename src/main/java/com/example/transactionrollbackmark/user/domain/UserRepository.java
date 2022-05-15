package com.example.transactionrollbackmark.user.domain;

import com.example.transactionrollbackmark.user.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
