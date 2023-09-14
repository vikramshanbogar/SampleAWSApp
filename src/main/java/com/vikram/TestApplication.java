package com.vikram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}


	@GetMapping("/")
	public String getInfo() throws UnknownHostException {
		return "Hi Vikram, Its from IP: "+ InetAddress.getLocalHost().getHostAddress();
	}
}
