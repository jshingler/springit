package com.shingler.springit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
//import ApplicationContext;

@SpringBootApplication
public class SpringitApplication {

    public static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println("sout message");
//            String[] beans = applicationContext.getBeanDefinitionNames();
//            Arrays.sort(beans);
//            for(String bean : beans) {
//                System.out.println(bean);
//            }

            log.error("CommandLineRunner.run()");
            log.warn("CommandLineRunner.run()");
            log.info("CommandLineRunner.run()");
            log.debug("CommandLineRunner.run()");
            log.trace("CommandLineRunner.run()");


        };
    }
}
