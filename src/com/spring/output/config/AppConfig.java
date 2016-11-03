package com.spring.output.config;

import com.spring.test.HelloWorld;
import org.springframework.context.annotation.Bean;

/**
 * Created by donar on 2016/11/3.
 */
public class AppConfig {
    @Bean(name = "helloBean")
    public HelloWorld helloWorld() {
        HelloWorld hl = new HelloWorld();
        hl.setName("donar zhu");
        return hl;
    }
}
