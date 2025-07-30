package com.bidding.bidding_platform;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = "com.bidding")
@EntityScan(basePackages = "com.bidding")
@RestController
public class BiddingPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiddingPlatformApplication.class, args);
	}

	@GetMapping()
	public String helloWorld(){
		return "Hello world spring boot";
	}

}
