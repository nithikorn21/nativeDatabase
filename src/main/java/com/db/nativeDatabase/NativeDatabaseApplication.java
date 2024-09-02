package com.db.nativeDatabase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.db.nativeDatabase.mapper")
public class NativeDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(NativeDatabaseApplication.class, args);
	}

}
