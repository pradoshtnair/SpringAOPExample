package com.pratishthan.sample.spring_aop_example;

import org.springframework.stereotype.Component;

@Component
public class SampleOperator {
    public int operate(int a, int b) {
        if(ReadOnlyContextHolder.isReadOnly()){
            return a;
        }
        else {
            return a + b;
        }
    }
}
