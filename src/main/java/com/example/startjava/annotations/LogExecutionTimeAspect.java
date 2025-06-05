package com.example.startjava.annotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogExecutionTimeAspect {

    @Around("@annotaion(LogExecutionTime)")
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        // 실제 메서드 실행
        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();
        System.out.println("[실행 시간] : " + joinPoint.getSignature() + " : " + (end-start) + "ms");
        return result;
    }
}
