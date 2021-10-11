package com.uday.about.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class AboutController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static Map<String, String> env;

    static {
        env = System.getenv();
    }

    /**
     * Get about message
     *
     * @return return about message
     */
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(){
        String dataCenter = env.get("DC_NAME");
        String cluster = env.get("CLUSTER_NAME");
        String verion = env.get("VERSION");
        String responseOut = dataCenter + "-" + cluster + "-"+verion + "-"+"I'am sample app";

        logger.info(responseOut);
        return responseOut;
    }
}
