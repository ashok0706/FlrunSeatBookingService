package com.example.BookingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;


//@ComponentScan(basePackages = "com.example.BookingService")
//@EnableJpaRepositories
@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Booking Service",
				version = "1.0.0",
				description = "Booking Service Documation"),
		servers = @Server(
				url = "http://localhost:8080",
				description = "Booking Service ")
		
		)
public class BookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingServiceApplication.class, args);
	}
	
	
//	 @Bean
//	    public Docket api() { 
//	        return new Docket(DocumentationType.SWAGGER_2)  
//	          .select()                                  
//	          .apis(RequestHandlerSelectors.basePackage("com.example.BookingService.Controller"))              
//	          .paths(PathSelectors.any())                          
//	          .build().apiInfo(apiInfo());                                        
//	    }
//	 
//	 private ApiInfo apiInfo() {
//			return new ApiInfoBuilder().title("Booking Service")
//					.description("CRUD Operationa Seat Bokings, Price, Email Conformation")
////					.termsOfServiceUrl("http://javainuse.com")
////					.contact("javainuse@gmail.com").license("JavaInUse License")
//					.licenseUrl("ashokyelagandula223@gmail.com").version("1.0").build();
//		}
}
