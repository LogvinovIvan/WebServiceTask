package com.epam.lab.task3.rest.json.config;

import com.epam.lab.ticket.manager.config.ApplicationConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@Import(ApplicationConfig.class)
@ComponentScan("com.epam.lab.task3.rest.json.service")
@EnableWebMvc
public class AppConfig {
}
