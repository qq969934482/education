package com.atguigu.edu.manager;


import feign.Retryer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.atguigu.edu.manager.dao")
public class EduManagerServiceApplication {
	@Bean
	public Retryer feignRetryer() {

		return Retryer.NEVER_RETRY;
	}

	public static void main(String[] args) {
		SpringApplication.run(EduManagerServiceApplication.class, args);
	}
}
