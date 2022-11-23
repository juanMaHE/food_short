package com.shortfood.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ShortFoodSupplyChainsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShortFoodSupplyChainsApplication.class, args);
	}

}
