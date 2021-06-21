package com.cognizant.bankmvc;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class BankmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankmvcApplication.class, args);
	}
}
