package com.atguigu.edu.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EduMemberServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduMemberServiceApplication.class, args);
	}
}
