package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by roshane on 2/20/2016.
 */

@SpringBootApplication
public class Application {

    private static final Logger logger= LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.debug("starting application with [{}]",args);
        SpringApplication.run(Application.class,args);
    }
}
