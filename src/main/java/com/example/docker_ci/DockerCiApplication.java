package com.example.docker_ci;

import lombok.Generated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Generated // jacoco 테스트 커러리지 테스트시 무시함
@SpringBootApplication
public class DockerCiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerCiApplication.class, args);
	}

}
