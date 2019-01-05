package com.yanwu.www;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableApolloConfig
@RestController
public class MyApp {

    @Value("${key}")
    private String env;

    public static void main(String[] args) {

        SpringApplication.run(MyApp.class);
    }

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(){
        System.out.println("=================");
        return env;
    }
}
