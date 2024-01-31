package com.example.EsercizioLezione.ApiConfig;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Claudio Vittorio Carta",
                        email = "cvcarta@proton.me",
                        url = "https://github.com/Morgoroth92"
                ),
                description = "Prova di esercizio con varie implementazioni tra cui swagger e cors",
                title = "Prova Lezione con Swagger e Cors",
                version = "1.0"
        )
)
public class ApiConfig {
}
