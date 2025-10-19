package org.cibertec.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConf {


	@Value("${app.queue.name}")
	private String queueName;
		

	@Bean(name = "queueConsumer")
	Queue queue() {
		return new Queue(queueName, true);
	}
	
}
