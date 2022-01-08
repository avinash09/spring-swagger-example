package com.techprimers.springboot.swaggerExample.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.techprimers.springboot.swaggerExample.resource"))
				.paths(PathSelectors.regex("\"/rest.*\""))
				.build()
				.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
        return new ApiInfoBuilder()
        		.title("Spring Boot Swagger Example API")
        		.description("Spring Boot Swagger Example API for Youtube")
        		.version( "1.0")
        		.license("Apache License Version 2.0")
        		.licenseUrl("https://www.apache.org/licesen.html")
				.contact(new Contact("TechPrimers", "https://www.youtube.com/TechPrimers",
						"techprimerschannel@gmail.com"))
        		.build();

    }

}
