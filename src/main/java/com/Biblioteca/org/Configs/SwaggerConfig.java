package com.Biblioteca.org.Configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {
    @Bean
    public OpenAPI apiInfo(){
        return new OpenAPI()
                .info(new Info()
                        .title("Gerenciador de Biblioteca")
                        .description("Documentçãoo da API com Swagger")
                        .version("v1.0"));
    }
}
