package com.bootcampmeli.ecommerceapi;

import com.bootcampmeli.ecommerceapi.services.DbService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApiApplication implements CommandLineRunner {

	private final DbService dbService;
	
	public EcommerceApiApplication(DbService dbService) {
		this.dbService = dbService;
	}

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dbService.instantiateDatabase();
	}

}
