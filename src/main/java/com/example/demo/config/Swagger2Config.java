package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger2Config {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("User Management REST API")
                        .description("User Management REST API")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Trịnh Minh Thúy")
                                .email("minhthuy30197@gmail.com")
                        )
                );
    }
}