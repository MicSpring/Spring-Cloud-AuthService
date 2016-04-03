package com.subha.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
//@EnableAutoConfiguration
@EnableDiscoveryClient
//@EnableHystrix
public class AuthServiceStarter {
	
	public static void main(String[] args)
	{
		//System.setProperty("spring.config.name", "authserver-config");
		SpringApplication.run(AuthServiceStarter.class, args);

	}

}
