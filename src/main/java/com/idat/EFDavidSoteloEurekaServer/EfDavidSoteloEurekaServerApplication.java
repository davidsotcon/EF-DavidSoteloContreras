package com.idat.EFDavidSoteloEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfDavidSoteloEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfDavidSoteloEurekaServerApplication.class, args);
	}

}
