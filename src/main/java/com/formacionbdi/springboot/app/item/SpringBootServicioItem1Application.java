package com.formacionbdi.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringBootServicioItem1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServicioItem1Application.class, args);
	}

}
