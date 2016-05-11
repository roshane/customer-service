package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by roshane on 2/20/2016.
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.repository"})
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.debug("CustomerService started with args [{}]", args);
        SpringApplication.run(Application.class, args);
    }
}
