package com.example.springbootpostgrejpa.global.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class HttpRequestConfig {

    @Bean
    public FilterRegistrationBean reReadableRequestFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new RequestFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }
}
