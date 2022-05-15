package com.example.transactionrollbackmark.point.domain.entity;

import com.example.transactionrollbackmark.common.entity.BaseTimeEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "points")
public class PointEntity extends BaseTimeEntity {
    @Column(name = "user_name", length = 20, unique = true)
    private String userName;

    @Column(name = "amount")
    private Long amount;

    @Builder
    private PointEntity(String userName, Long amount) {
        this.userName = userName;
        this.amount = amount;
    }
}
