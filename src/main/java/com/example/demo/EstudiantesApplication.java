package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2

public class EstudiantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudiantesApplication.class, args);
	}


	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.progra3.estudiantes"))
				.build()
				.apiInfo(apiDetails());

	}
	private ApiInfo apiDetails() {
		return new ApiInfoBuilder()
				.title("api estudiantes")
				.contact(new Contact("Charles","no-url", "myemail"))
				.description("Muestra api SPRINGBOOT")
				.build();
	}

}
