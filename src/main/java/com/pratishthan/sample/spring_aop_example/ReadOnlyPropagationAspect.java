package com.pratishthan.sample.spring_aop_example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ReadOnlyPropagationAspect {
    @Around("@annotation(com.pratishthan.sample.spring_aop_example.ReadOnly)")
    public Object propagateReadOnly(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            ReadOnlyContextHolder.setReadOnly(true);
            return joinPoint.proceed();
        } finally {
            ReadOnlyContextHolder.clear();
        }
    }
}
