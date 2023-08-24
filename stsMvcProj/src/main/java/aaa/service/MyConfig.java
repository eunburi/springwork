package aaa.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import aaa.model.Battery;

@Configuration
public class MyConfig {
	///aaa에 있다가 aaa.service로 이사옴
	@Bean
	Battery bat1() {
		return new Battery("로켓트박대리", 500);
	}
	
	@Bean
	Battery bat2() {
		return new Battery("사랑의밧대리", 300);
	}

}
