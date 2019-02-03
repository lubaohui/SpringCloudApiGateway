package com.admin.demo;

import com.admin.demo.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApiGatewayApplication.class).web(true).run(args);

	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
/*
	@Bean
	public ThrowExceptionFilter throwExceptionFilter() {
		return new ThrowExceptionFilter();
	}

	@Bean
	public ErrorFilter errorFilter() { 
		return new ErrorFilter();
	}*/

}
