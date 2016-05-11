package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class MessageController {


    @Value("${welcome.message}")
    private String welcomeMessage;

    private final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @RequestMapping(name = "/message", method = RequestMethod.GET)
    public String getWelcomeMessage() {
        logger.debug("path","/message","response with",welcomeMessage);
        return welcomeMessage;
    }

}
