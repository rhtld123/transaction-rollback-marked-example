package com.example.transactionrollbackmark.user.dto;

import com.example.transactionrollbackmark.user.domain.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserSignUpDto {

    private String name;

    public UserEntity toEntity() {
        return UserEntity.builder()
            .name(this.name)
            .build();
    }

    public static UserSignUpDto from(String name) {
        return new UserSignUpDto(name);
    }

}
