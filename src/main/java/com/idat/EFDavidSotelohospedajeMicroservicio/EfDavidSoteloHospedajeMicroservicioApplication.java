package com.idat.EFDavidSotelohospedajeMicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EfDavidSoteloHospedajeMicroservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfDavidSoteloHospedajeMicroservicioApplication.class, args);
	}

}
