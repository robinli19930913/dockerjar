package com.example.dockerjar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerjarApplication {
	private static Logger logger = LoggerFactory.getLogger(DockerjarApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DockerjarApplication.class, args);
		logger.error("====启动成功====");
		System.out.println("===========启动成功===================");
	}

}
