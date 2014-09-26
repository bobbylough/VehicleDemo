package com.github.bobbylough.vehicleDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;


@Configuration
public class MVCConfig {


	@Bean
	public FreeMarkerConfigurer freeMarkerConfigurer() {
		FreeMarkerConfigurer fmc = new FreeMarkerConfigurer();
		fmc.setTemplateLoaderPaths("/WEB-INF/ftl/");
		return fmc;
	}

	@Bean(name = DispatcherServlet.MULTIPART_RESOLVER_BEAN_NAME)
	public MultipartResolver multipartResolver() {
		return new CommonsMultipartResolver();
	}

	@Bean
	public FreeMarkerViewResolver freeMarkerViewResolver() {
		FreeMarkerViewResolver fvr = new FreeMarkerViewResolver();
		fvr.setCache(false);
		fvr.setPrefix("");
		fvr.setSuffix(".ftl");
		fvr.setRequestContextAttribute("rc");
		return fvr;
	}

}
