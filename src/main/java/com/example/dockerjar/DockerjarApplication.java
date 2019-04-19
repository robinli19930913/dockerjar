package com.example.dockerjar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerjarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerjarApplication.class, args);
		System.out.println("===========启动成功===================");
	}

}
