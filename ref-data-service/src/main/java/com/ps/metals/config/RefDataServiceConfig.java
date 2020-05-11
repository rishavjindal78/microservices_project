package com.ps.metals.config;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import io.swagger.v3.oas.models.OpenAPI;

import io.swagger.v3.oas.models.info.Info;

import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RefDataServiceConfig {

    @Bean
    public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption, @Value("${application-version}") String appVersion) {
        return new OpenAPI()
                .info(new Info()
                                .title("Reference Data Service API")
                                .version(appVersion)
                                .description(appDesciption)
                        //               .termsOfService("http://swagger.io/terms/")
                        //              .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                );
    }

}