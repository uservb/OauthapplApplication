package com.oauth.example.oauthappl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@EnableOAuth2Sso
@SpringBootApplication
@Controller
public class OauthapplApplication {
	
	@GetMapping("/")
	public String index() {
        return "load";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(OauthapplApplication.class, args);
	}
	
}
