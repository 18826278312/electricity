package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ElectricityApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {

		SpringApplication.run(ElectricityApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ElectricityApplication.class);
	}
}

//@SpringBootApplication
//public class IngenuityApplication extends SpringBootServletInitializer {
//
//	public static void main(String[] args) {
//
//		SpringApplication.run(IngenuityApplication.class, args);
//	}
//
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(IngenuityApplication.class);
//	}
//}