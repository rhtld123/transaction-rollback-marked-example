package com.example.transactionrollbackmark.user.domain.entity;

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
@Table(name = "users")
public class UserEntity extends BaseTimeEntity {
    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Builder
    private UserEntity(String name) {
        this.name = name;
    }
}
