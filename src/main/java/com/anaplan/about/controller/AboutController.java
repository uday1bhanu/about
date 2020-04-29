package com.uday.about.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Get about message
     *
     * @return return about message
     */
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(){
        logger.info("I'am sample app v5");
        return "I'am sample app v5";
    }
}
