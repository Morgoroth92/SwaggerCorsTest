package com.example.EsercizioLezione;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EsercizioLezioneApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsercizioLezioneApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/v1/cars/all").allowedOrigins("http://localhost:8080");
				registry.addMapping("/v1/cars/add").allowedOrigins("http://localhost:8080");
				registry.addMapping("/v1/cars/addMany").allowedOrigins("http://localhost:8080");
				registry.addMapping("/v1/cars/addManyV2").allowedOrigins("http://localhost:8080");
				registry.addMapping("/v1/cars/searchModel").allowedOrigins("http://localhost:8080");
			}
		};  //@CrossOrigin(origins = "http://localhost:9000") questo si applica sulla classe controller ed ha lo
		// stesso effetto ma ha priorità rispetto a questo qua sopra. si puo applicare per singolo metodo
		//oppure a monte della classe su tutta la classe.
	}
}
