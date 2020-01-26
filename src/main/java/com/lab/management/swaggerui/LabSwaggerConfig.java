package com.lab.management.swaggerui;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class LabSwaggerConfig {
	
	public static final String CALLCONTROLLER = "com.lab.management.controller";
	public static final String LAB = "/lab.*";
	
	
	  public Docket registerUserApi() { return new
	  Docket(DocumentationType.SWAGGER_2)
	  .select().apis(RequestHandlerSelectors.basePackage(CALLCONTROLLER)).paths(
	  regexpURLValidator(LAB)).build();
	  
	  }
	  
	  private Predicate<String> regexpURLValidator(String string) { 
		  return p -> p.equals(string);
	  
	  }
	 
}
