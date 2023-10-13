package com.allane.carrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);
	}
//TODO Document Docker command -
// docker run -d -p 3306:3306 --name mysql-container -e MYSQL_ROOT_PASSWORD=C@rR3nt@l2023 -e MYSQL_DATABASE=carrental_db mysql:latest
}
//TODO Remove
/*
* mysql -u root -p
USE carrental_db;

 * */