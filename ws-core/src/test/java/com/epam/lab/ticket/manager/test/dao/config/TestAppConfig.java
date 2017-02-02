package com.epam.lab.ticket.manager.test.dao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Ivan_Lohvinau on 2/1/2017.
 */
@Configuration
@ComponentScan("com.epam.lab.ticket.manager.dao")
@Import(TestHibernateConfig.class)
public class TestAppConfig {
}
