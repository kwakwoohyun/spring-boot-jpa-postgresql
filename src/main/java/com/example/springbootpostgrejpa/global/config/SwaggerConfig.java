package com.example.springbootpostgrejpa.global.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("Default Group1")
                .pathsToMatch("/**")
                .build();
    }

    /**
     * Controller 마다 탭을 나눈다면 사용
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("Default Group1")
                .pathsToMatch("/**")
                .build();
    }
     */

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("API Swagge Title Here")
                        .description("API Swagger Description Here")
                        .version("0.1"));
    }
}
