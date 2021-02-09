package com.order.tracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.oms.web"))
                .paths(regex("/*.*"))
                .build()
                .apiInfo(metaData());
    }
    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Order Tracker App",
                "REST API for Order Management",
                "1.0.0",
                "Terms & Condition",
                new Contact("Test App", "http://ordertracker.com/", "devs@cooldev.com"),
               "Test License 1.0.0",
                "http://www.testlicense.com/licenses/TEST-LICENSE-1.0.0");
        return apiInfo;
    }
}
