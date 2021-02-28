package com.vincent.change;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class ChangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChangeApplication.class, args);
        System.out.println("springboot start success!");
    }

}
