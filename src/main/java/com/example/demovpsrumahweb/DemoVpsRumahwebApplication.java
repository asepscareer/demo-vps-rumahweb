package com.example.demovpsrumahweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/test")
public class DemoVpsRumahwebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoVpsRumahwebApplication.class, args);
    }

    @GetMapping(value = "/")
    public String testData() {
        return "OKE ASEP";
    }

}
