package com.pratishthan.sample.spring_aop_example;

import org.springframework.stereotype.Component;

@Component
public class OperatorController {

    private final OperatorService operator;
    OperatorController(OperatorService operator){
        this.operator=operator;
    }
    @ReadOnly
    public void operateInReadOnly ( int i, int j){
        operator.operateInReadOnly(i, j);
    }

    /*What the ReadOnly annotation with the Aspec Coding will roughly translate to the below code

    ''' public void bareOperateInReadOnly ( int i, int j){
        operator.operateInReadOnly(i, j);
    }
    public void operateAnnotateResulInReadOnly ( int i, int j) {
        try {
            ReadOnlyContextHolder.setReadOnly(true);
            this.bareOperateInReadOnly(i, j);
        } finally {
            ReadOnlyContextHolder.clear();
        }
    }'''
    */
    public void operateInWrite(int i, int j){
        operator.operateInWrite(i,j);
    }
}
