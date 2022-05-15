package com.example.transactionrollbackmark.point.aop.advisor;

import com.example.transactionrollbackmark.point.domain.repository.PointRepository;
import com.example.transactionrollbackmark.point.dto.PointSaveDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class PointSaveAdvisor {

    private final PointRepository pointRepository;

    @AfterReturning(value = "@annotation(com.example.transactionrollbackmark.point.aop.annotation.PointSave)", returning = "returnValue")
    public void save(JoinPoint joinPoint, Object returnValue) {
        log.info("====== PointSaveAdvisor 실행 ======");
        try {
            PointSaveDto pointSaveDto = (PointSaveDto) returnValue;
            pointRepository.save(PointSaveDto.of("zz",1L).toEntity());
            pointRepository.save(pointSaveDto.toEntity());
        } catch (DataIntegrityViolationException | ConstraintViolationException ignore) {
            log.info("DataIntegrityViolationException ignored..");
        }

    }
}
