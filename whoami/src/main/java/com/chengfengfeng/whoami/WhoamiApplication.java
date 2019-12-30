package com.chengfengfeng.whoami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
public class WhoamiApplication {

    public static final String uuid = UUID.randomUUID().toString();

    public static void main(String[] args) {
        SpringApplication.run(WhoamiApplication.class, args);
    }

    @RequestMapping("/")
    public String sayHello() {
        return "hello,i am " + uuid;
    }

}
