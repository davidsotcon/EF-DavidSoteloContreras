package com.idat.EFDavidSoteloTutistaMicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EfDavidSoteloTutistaMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfDavidSoteloTutistaMicroservicioApplication.class, args);
	}

}
