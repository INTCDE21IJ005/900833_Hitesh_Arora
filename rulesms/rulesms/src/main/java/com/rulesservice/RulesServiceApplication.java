package com.rulesservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class RulesServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(RulesServiceApplication.class, args);
	}
		
}
