package com.example.transactionrollbackmark.user.controller;

import com.example.transactionrollbackmark.user.dto.UserSignUpDto;
import com.example.transactionrollbackmark.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/api/v1/users")
    public ResponseEntity<?> save(@RequestBody UserSignUpDto dto) {
        log.info("===/api/v1/users 요청===");
        return ResponseEntity.ok(userService.save(dto));
    }
}
