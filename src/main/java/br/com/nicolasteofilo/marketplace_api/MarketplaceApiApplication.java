package br.com.nicolasteofilo.marketplace_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MarketplaceApiApplication {
	@GetMapping("/")
	public String helloWord() {
		return "Welcome to Marketplace API";
	}

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceApiApplication.class, args);
	}
}
