package com.pratishthan.sample.spring_aop_example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopExampleApplication implements CommandLineRunner {

	private final OperatorController controller;
	public SpringAopExampleApplication(OperatorController controller){
		this.controller	= controller;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAopExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		controller.operateInReadOnly(1,2);
		controller.operateInWrite(1,2);
		controller.operateInReadOnly(2,3);
	}
}
