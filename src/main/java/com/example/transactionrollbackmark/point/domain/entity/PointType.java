package com.example.transactionrollbackmark.point.domain.entity;

public enum PointType {
    NEW_USER("NEW_USER", "신규유저");

    private final String code;
    private final String description;

    PointType(String code, String description) {
        this.code = code;
        this.description = description;
    }

}
