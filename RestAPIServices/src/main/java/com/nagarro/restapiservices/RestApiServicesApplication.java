package com.nagarro.restapiservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The Class RestApiServicesApplication.
 */
@SpringBootApplication
@Configuration
@EnableWebMvc
public class RestApiServicesApplication implements WebMvcConfigurer {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(RestApiServicesApplication.class, args);
	}
	@Override
    public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
    }

}
