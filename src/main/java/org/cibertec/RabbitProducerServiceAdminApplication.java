package org.cibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.cibertec")
public class RabbitProducerServiceAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitProducerServiceAdminApplication.class, args);
	}

}
