package com.pratishthan.sample.spring_aop_example;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdderAfterReturnAspect {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @AfterReturning(
            pointcut = "execution(* com.pratishthan.sample.spring_aop_example.SampleOperator+.*(..))",
            returning = "returnValue"
    )
    public void afterReturn(Object returnValue) {
        logger.info("value return was {}",  returnValue);
    }


}
