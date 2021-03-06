package io.goodname01.messenger;

import io.goodname01.controller.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import java.util.List;
import java.util.ArrayList;

@SpringBootApplication
@ComponentScan(basePackages = "io.goodname01.controller")
@Configuration
public class MessengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessengerApplication.class, args);
	}

	@Bean
	public List<Message> messages() {
		return new ArrayList<Message>(100);
	}

}
