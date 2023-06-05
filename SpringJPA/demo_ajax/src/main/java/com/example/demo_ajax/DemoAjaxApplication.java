package com.example.demo_ajax;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoAjaxApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAjaxApplication.class, args);
    }

}
