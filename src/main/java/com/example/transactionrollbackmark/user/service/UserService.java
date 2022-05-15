package com.example.transactionrollbackmark.user.service;

import com.example.transactionrollbackmark.point.aop.annotation.PointSave;
import com.example.transactionrollbackmark.point.domain.entity.PointType;
import com.example.transactionrollbackmark.point.dto.PointSaveDto;
import com.example.transactionrollbackmark.user.domain.UserRepository;
import com.example.transactionrollbackmark.user.domain.entity.UserEntity;
import com.example.transactionrollbackmark.user.dto.UserSignUpDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @PointSave(type = PointType.NEW_USER)
    @Transactional
    public PointSaveDto save(UserSignUpDto dto) {
        return PointSaveDto.of(saveUserEntity(dto).getName(), 1L);
    }

    private UserEntity saveUserEntity(UserSignUpDto dto) {
        return userRepository.save(dto.toEntity());
    }
}
