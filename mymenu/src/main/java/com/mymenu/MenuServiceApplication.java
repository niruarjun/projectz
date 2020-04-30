package com.mymenu;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableSwagger2
public class MenuServiceApplication 
{
public static void main(String[] args) 
{
SpringApplication.run(MenuServiceApplication.class, args);
}

@Bean
public Docket swaggerCongiuration() {
	return new Docket(DocumentationType.SWAGGER_2)
	 .select()
	  .paths(PathSelectors.any())
	  .apis(RequestHandlerSelectors.basePackage("com.mymenu")) 
	  .build()
	  .apiInfo(apiDetails());





}

private ApiInfo apiDetails() {
	// TODO Auto-generated method stub
	return new ApiInfo("Menu api", 
			
			"Swagger api documenmtation for Menu",					
			"2.0.0",					
			"Free to use",					
			new springfox.documentation.service.Contact("Menu", "http://menu.io", "a@gmail.com"),					
			"API license", 
			"http://menu.io",					
			Collections.emptyList());
}
}
