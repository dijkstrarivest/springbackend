package com.example.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Mapeia todas as requisições que começam com /api
                .allowedOrigins("https://springfrontend.vercel.app/") // Permite o frontend local
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite métodos HTTP específicos
                .allowCredentials(true); // Permite enviar cookies e cabeçalhos de autenticação
    }
}
