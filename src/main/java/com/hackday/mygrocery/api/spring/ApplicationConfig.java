package com.hackday.mygrocery.api.spring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.inject.Inject;
import java.security.SecureRandom;

@Configuration
@ComponentScan({"com.hackday.mygrocery.apis", "com.hackday.mygrocery.service"})
public class ApplicationConfig {

    // Reference:
    // http://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch04s02.html



}
