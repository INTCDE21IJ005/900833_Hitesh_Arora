package com.cognizant.accountservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class AccountserviceApplication {

	public static void main(String[] args) { 
		SpringApplication.run(AccountserviceApplication.class, args);
	}
}
