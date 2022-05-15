package com.example.transactionrollbackmark.point.dto;

import com.example.transactionrollbackmark.point.aop.annotation.PointSave;
import com.example.transactionrollbackmark.point.domain.entity.PointEntity;
import lombok.Getter;

@Getter
public class PointSaveDto {
    private String name;
    private Long amount;

    private PointSaveDto(String name, Long amount) {
        this.name = name;
        this.amount = amount;
    }

    public static PointSaveDto of(String name, Long amount) {
        return new PointSaveDto(name, amount);
    }

    public PointEntity toEntity() {
        return PointEntity.builder()
            .userName(this.name)
            .amount(this.amount)
            .build();
    }
}
