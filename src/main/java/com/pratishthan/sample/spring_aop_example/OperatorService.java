package com.pratishthan.sample.spring_aop_example;

import org.springframework.stereotype.Service;

@Service
public class OperatorService {

    private final SampleOperator operator;

    public OperatorService(SampleOperator operator) {
        this.operator = operator;
    }

    public void operateInReadOnly(int i, int j) {
        operator.operate(i, j);
    }

    public void operateInWrite(int i, int j) {
        operator.operate(i, j);
    }
}
