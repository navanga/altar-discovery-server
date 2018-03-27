package com.navanga.altar.altardiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AltarDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AltarDiscoveryServerApplication.class, args);
	}
}
