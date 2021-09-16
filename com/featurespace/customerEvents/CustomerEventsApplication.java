package com.featurespace.customerEvents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CustomerEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerEventsApplication.class, args);
	}

}
