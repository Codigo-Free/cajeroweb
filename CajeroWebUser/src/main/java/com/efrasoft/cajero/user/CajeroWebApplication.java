package com.efrasoft.cajero.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.efrasoft.cajero.commons.entity"})
@SpringBootApplication
public class CajeroWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CajeroWebApplication.class, args);
	}

}
