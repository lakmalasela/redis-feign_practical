package com.mylogin.pract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCaching
public class PractApplication {

	public static void main(String[] args) {
		SpringApplication.run(PractApplication.class, args);
		System.out.println("Test Student");
	}

}