package com.github.bobbylough.vehicleDemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan("com.github.bobbylough.vehicleDemo")
@EnableWebMvc
public class AppConfig {

}
