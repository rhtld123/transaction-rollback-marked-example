package com.example.transactionrollbackmark;

import com.example.transactionrollbackmark.point.domain.entity.PointEntity;
import com.example.transactionrollbackmark.point.domain.repository.PointRepository;
import com.example.transactionrollbackmark.user.dto.UserSignUpDto;
import com.example.transactionrollbackmark.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class Runner implements ApplicationRunner {

    private final UserService userService;
    private final PointRepository pointRepository;
    private static final String USER_NAME = "고승현";

    @Override
    public void run(ApplicationArguments args) throws Exception {
    /*
    //  API 호출 테스트를 하기 위해 주석처리

        log.info("====== Point 등록 시작 ======");
        pointRepository.save(PointEntity.builder()
            .userName(USER_NAME)
            .amount(1L)
            .build());
        log.info("====== 유저 회원가입 시작 ======");
        userService.save(UserSignUpDto.from(USER_NAME));

    */
    }
}
