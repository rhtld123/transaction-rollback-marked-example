package com.example.transactionrollbackmark.point.domain.repository;

import com.example.transactionrollbackmark.point.domain.entity.PointEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<PointEntity, Long> {

}
