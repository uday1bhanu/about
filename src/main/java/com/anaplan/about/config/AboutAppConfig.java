package com.uday.about.config;

import com.uday.about.filter.ResponseHeadersFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AboutAppConfig {

    @Bean
    public ResponseHeadersFilter responseHeadersFilter(){
        return new ResponseHeadersFilter();
    }

}